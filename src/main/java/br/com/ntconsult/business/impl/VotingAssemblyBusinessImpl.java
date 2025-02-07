package br.com.ntconsult.business.impl;

import br.com.ntconsult.business.VotingAssemblyBusiness;
import br.com.ntconsult.dto.VoteCountResponseDTO;
import br.com.ntconsult.dto.VoteRequestDTO;
import br.com.ntconsult.entity.Person;
import br.com.ntconsult.entity.VotingAssembly;
import br.com.ntconsult.enums.PersonExceptionEnum;
import br.com.ntconsult.enums.VoteEnum;
import br.com.ntconsult.enums.VotingAssemblyExceptionEnum;
import br.com.ntconsult.exception.BusinessException;
import br.com.ntconsult.repository.PersonRepository;
import br.com.ntconsult.repository.VotingAssemblyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class VotingAssemblyBusinessImpl implements VotingAssemblyBusiness {

    @Autowired
    private VotingAssemblyRepository repository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void registerVote(VoteRequestDTO requestDTO) {
        Optional<Person> person = personRepository.findById(requestDTO.getIdUser());
        if (person.isEmpty()) {
            throw new BusinessException(VotingAssemblyExceptionEnum.USER_NOT_REGISTERED.getMessage());
        }
        Optional<VotingAssembly> vote = repository.findByIdUser(requestDTO.getIdUser());
        if(vote.isPresent()) {
            throw new BusinessException(VotingAssemblyExceptionEnum.VOTE_ALREADY_EXIST.getMessage());
        }
        requestDTO.setAssemblyDate(LocalDateTime.now());
        repository.save(mapper.map(requestDTO, VotingAssembly.class));
    }

    @Override
    public VoteCountResponseDTO countVotes() {
        Long totalVotes = repository.count();
        Long votesYes = repository.countByVote(VoteEnum.SIM.getDescription());
        Long votesNo = repository.countByVote(VoteEnum.NAO.getDescription());
        return VoteCountResponseDTO.builder()
                .voteQuantity(totalVotes)
                .voteYesQuantity(votesYes)
                .voteNoQuantity(votesNo)
                .winner(votesYes > votesNo ? VoteEnum.SIM : VoteEnum.NAO)
                .build();
    }
}
