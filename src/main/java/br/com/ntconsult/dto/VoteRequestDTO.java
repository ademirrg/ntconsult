package br.com.ntconsult.dto;

import br.com.ntconsult.enums.VoteEnum;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class VoteRequestDTO {
    @NonNull
    private Long idUser;

    @NonNull
    private VoteEnum vote;
}
