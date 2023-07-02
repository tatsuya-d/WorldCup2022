package com.raisetech.worldCup2022.Controller;

import com.raisetech.worldCup2022.Entity.ParticipatingCountry;
import com.raisetech.worldCup2022.Mapper.ParticipatingCountryMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParticipatingCountryController {

    private final ParticipatingCountryMapper participatingCountryMapper;

    public ParticipatingCountryController(ParticipatingCountryMapper participatingCountryMapper) {
        this.participatingCountryMapper = participatingCountryMapper;
    }

    @GetMapping("/participating-country")
    public List<ParticipatingCountry> selectContinent(@RequestParam("continent") String continent) {
        return participatingCountryMapper.findByContinent(continent);
    }
}
