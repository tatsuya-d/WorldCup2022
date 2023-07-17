package com.raisetech.worldCup2022.service;

import com.raisetech.worldCup2022.ResourceNotFoundException;
import com.raisetech.worldCup2022.entity.ParticipatingCountry;
import com.raisetech.worldCup2022.mapper.ParticipatingCountryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipatingCountryServiceImpl implements ParticipatingCountryService {

    private final ParticipatingCountryMapper participatingCountryMapper;

    public ParticipatingCountryServiceImpl(ParticipatingCountryMapper participatingCountryMapper) {
        this.participatingCountryMapper = participatingCountryMapper;
    }

    @Override
    public ParticipatingCountry findById(int id) {
        Optional<ParticipatingCountry> participatingCountry = participatingCountryMapper.findById(id);
        return participatingCountry.orElseThrow(() -> new ResourceNotFoundException("resource not found:" + id));
    }

    @Override
    public List<ParticipatingCountry> findByContinent(String continent) {
        return participatingCountryMapper.findByContinent(continent);
    }

    @Override
    public ParticipatingCountry createParticipatingCountry(int id, String name, String continent) {
        ParticipatingCountry participatingCountry = new ParticipatingCountry(id, name, continent);
        participatingCountryMapper.createParticipatingCountry(participatingCountry);
        return participatingCountry;
    }

    @Override
    public void updateParticipatingCountry(int id, String name, String continent) {
        participatingCountryMapper.updateParticipatingCountry(id, name, continent);
    }

    @Override
    public void deleteParticipatingCountry(int id) {
        participatingCountryMapper.deleteParticipatingCountry(id);
    }
}

