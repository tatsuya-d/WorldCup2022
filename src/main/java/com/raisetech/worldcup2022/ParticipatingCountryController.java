package com.raisetech.worldcup2022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ParticipatingCountryController {

    private final ParticipatingCountryMapper participatingCountryMapper;

    public ParticipatingCountryController(ParticipatingCountryMapper participatingCountryMapper) {
        this.participatingCountryMapper = participatingCountryMapper;
    }

    @GetMapping("/participatingCountry/{id}")
    public Optional<ParticipatingCountry> selectParticipatingCountry(@PathVariable("id")int id) {
        return participatingCountryMapper.findById(id);
    }

}
