package br.com.ntconsult.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VoteEnum {
    SIM("S"),
    NAO("N"),
    EMPATE("E");

    private final String description;
}
