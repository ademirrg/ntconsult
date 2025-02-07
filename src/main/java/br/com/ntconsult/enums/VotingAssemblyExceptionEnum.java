package br.com.ntconsult.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VotingAssemblyExceptionEnum {
    VOTE_ALREADY_EXIST(400, "O usuário já registrou seu voto anteriormente."),
    USER_NOT_REGISTERED(400, "O usuário informado não está cadastrado.");

    private Integer code;
    private String message;
}
