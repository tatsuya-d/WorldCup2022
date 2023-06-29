package com.raisetech.worldCup2022;

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

    @GetMapping("/participating-country/{continent}")
    public Optional<ParticipatingCountry> selectNumber(@PathVariable("continent") String continent) {
        return participatingCountryMapper.findByContinent(continent);
    }

}
