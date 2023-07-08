package com.raisetech.worldCup2022.controller;

import com.raisetech.worldCup2022.entity.ParticipatingCountry;
import com.raisetech.worldCup2022.mapper.ParticipatingCountryMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/participating-country/{id}")
    public List<ParticipatingCountry> selectParticipatingCountry(@PathVariable("id") int id) {
        return participatingCountryMapper.findById(id);
    }

    @PostMapping("/participating-country")
    ResponseEntity<Map<String, String>> createParticipatingCountry(@RequestBody ParticipatingCountryResponse form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/participating-country")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "participating country was successfully created"));
    }

    @PatchMapping("/participating-country/{id}")
    ResponseEntity<Map<String, String>> updateParticipatingCountry(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "successfully updated"));
    }

    @DeleteMapping("/participating-country/{id}")
    public ResponseEntity<Void> deleteParticipatingCountry(@PathVariable("id") int delete) {
        return ResponseEntity.noContent().build();
    }
}
