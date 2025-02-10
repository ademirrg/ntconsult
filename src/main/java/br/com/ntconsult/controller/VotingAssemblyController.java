package br.com.ntconsult.controller;

import br.com.ntconsult.business.VotingAssemblyBusiness;
import br.com.ntconsult.dto.VoteCountResponseDTO;
import br.com.ntconsult.dto.VoteRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/vote")
public class VotingAssemblyController {

    @Autowired
    VotingAssemblyBusiness business;

    @PostMapping("/register")
    private ResponseEntity<String> registerVote(@Valid @RequestBody VoteRequestDTO requestDTO) {
        business.registerVote(requestDTO);
        return ResponseEntity.ok("Voto registrado com sucesso.");
    }

    @GetMapping("/count")
    private ResponseEntity<VoteCountResponseDTO> countVotes() {
        return ResponseEntity.ok(business.countVotes());
    }

}
