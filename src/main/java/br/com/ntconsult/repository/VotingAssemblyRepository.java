package br.com.ntconsult.repository;

import br.com.ntconsult.entity.VotingAssembly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VotingAssemblyRepository extends JpaRepository<VotingAssembly, Long> {
    Long countByVote(String vote);
    Optional<VotingAssembly> findByIdUser(Long idUser);
}
