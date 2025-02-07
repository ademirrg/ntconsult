package br.com.ntconsult.business;

import br.com.ntconsult.dto.PersonRequestDTO;
import br.com.ntconsult.dto.PersonResponseDTO;

import java.util.List;

public interface PersonBusiness {

    PersonResponseDTO findByDocument(String document);
    List<PersonResponseDTO> findAll();
    PersonResponseDTO createPerson(PersonRequestDTO requestDTO);
    PersonResponseDTO updatePerson(PersonRequestDTO requestDTO, Long id);
    void deletePerson(Long id);
}
