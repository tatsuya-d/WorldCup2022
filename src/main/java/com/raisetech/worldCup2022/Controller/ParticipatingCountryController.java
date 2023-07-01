package com.raisetech.worldCup2022.Controller;

import com.raisetech.worldCup2022.Entity.ParticipatingCountry;
import com.raisetech.worldCup2022.Mapper.ParticipatingCountryMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipatingCountryController {

    private final ParticipatingCountryMapper participatingCountryMapper;

    public ParticipatingCountryController(ParticipatingCountryMapper participatingCountryMapper) {
        this.participatingCountryMapper = participatingCountryMapper;
    }

    @GetMapping("/participating-country/{continent}")
    public ParticipatingCountry selectNumber(@PathVariable("continent") String continent) {
        return participatingCountryMapper.findByContinent(continent);
    }

}
