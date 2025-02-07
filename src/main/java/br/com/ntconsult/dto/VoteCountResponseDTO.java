package br.com.ntconsult.dto;

import br.com.ntconsult.enums.VoteEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VoteCountResponseDTO {

    private Long voteQuantity;
    private Long voteYesQuantity;
    private Long voteNoQuantity;
    private VoteEnum winner;

}
