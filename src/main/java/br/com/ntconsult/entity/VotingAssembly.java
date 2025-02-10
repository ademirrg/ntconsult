package br.com.ntconsult.entity;

import br.com.ntconsult.enums.VoteEnum;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "voting_assembly")
@Data
public class VotingAssembly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "vote")
    private VoteEnum vote;

    @Column(name = "assembly_date")
    private LocalDateTime assemblyDate;

}
