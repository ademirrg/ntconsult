package br.com.ntconsult.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VoteEnum {
    SIM("S"),
    NAO("N");

    private final String description;
}
