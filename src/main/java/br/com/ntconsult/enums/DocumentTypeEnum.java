package br.com.ntconsult.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DocumentTypeEnum {
    CPF("CPF"),
    CNPJ("CNPJ");

    private final String description;
}
