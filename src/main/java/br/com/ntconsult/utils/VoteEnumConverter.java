package br.com.ntconsult.utils;

import br.com.ntconsult.enums.VoteEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class VoteEnumConverter implements AttributeConverter<VoteEnum, String> {

    @Override
    public String convertToDatabaseColumn(VoteEnum vote) {
        if (vote == null) {
            return null;
        }
        return vote.getDescription();
    }

    @Override
    public VoteEnum convertToEntityAttribute(String description) {
        if (description == null) {
            return null;
        }

        return Stream.of(VoteEnum.values())
                .filter(c -> c.getDescription().equals(description))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
