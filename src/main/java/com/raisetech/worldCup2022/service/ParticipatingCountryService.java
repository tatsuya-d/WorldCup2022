package com.raisetech.worldCup2022.service;

import com.raisetech.worldCup2022.entity.ParticipatingCountry;

import java.util.List;

public interface ParticipatingCountryService {

    List<ParticipatingCountry> findById(int id);

    List<ParticipatingCountry> findByContinent(String continent);

    void createParticipatingCountry(int id, String name, String continent);

    void updateParticipatingCountry(int id, String name, String continent);

    void deleteParticipatingCountry(int id);
}
