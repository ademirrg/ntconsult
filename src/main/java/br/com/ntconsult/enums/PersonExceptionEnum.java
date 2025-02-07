package br.com.ntconsult.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PersonExceptionEnum {
    CPF_ALREADY_EXIST(400, "CPF já cadastrado em nossa base.");

    private Integer code;
    private String message;
}
