package br.com.ntconsult.business;

import br.com.ntconsult.dto.VoteCountResponseDTO;
import br.com.ntconsult.dto.VoteRequestDTO;

public interface VotingAssemblyBusiness {
    void registerVote(VoteRequestDTO requestDTO);
    VoteCountResponseDTO countVotes();
}
