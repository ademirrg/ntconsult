package br.com.ntconsult.dto;

import br.com.ntconsult.enums.VoteEnum;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VoteRequestDTO {
    @NonNull
    private Long idUser;

    @NonNull
    private VoteEnum vote;

    private LocalDateTime assemblyDate;
}
