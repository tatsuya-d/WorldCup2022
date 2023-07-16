package com.raisetech.worldCup2022.controller;

import com.raisetech.worldCup2022.entity.ParticipatingCountry;
import com.raisetech.worldCup2022.entity.ParticipatingCountryUpdate;
import com.raisetech.worldCup2022.service.ParticipatingCountryService;
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

    private final ParticipatingCountryService participatingCountryService;

    public ParticipatingCountryController(ParticipatingCountryService participatingCountryService) {
        this.participatingCountryService = participatingCountryService;
    }

    @GetMapping("/participating-countries")
    public List<ParticipatingCountry> responseContinent(@RequestParam("continent") String continent) {
        return participatingCountryService.findByContinent(continent);
    }

    @GetMapping("/participating-countries/{id}")
    public List<ParticipatingCountry> responseId(@PathVariable("id") int id) {
        return participatingCountryService.findById(id);
    }

    @PostMapping("/participating-countries")
    public ResponseEntity<Map<String, String>> createParticipatingCountry(@RequestBody ParticipatingCountry form, UriComponentsBuilder uriBuilder) {
        ParticipatingCountry participatingCountry = participatingCountryService.createParticipatingCountry(form.getId(), form.getName(), form.getContinent());
        URI url = uriBuilder
                .path("/participating-countries/" + participatingCountry.getId())
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "participating country was successfully created"));
    }

    @PatchMapping("/participating-countries/{id}")
    public ResponseEntity<Map<String, String>> updateParticipatingCountry(@PathVariable("id") int id, @RequestBody ParticipatingCountryUpdate update) {
        participatingCountryService.updateParticipatingCountry(id, update.getName(), update.getContinent());
        return ResponseEntity.ok(Map.of("message", "successfully updated"));
    }

    @DeleteMapping("/participating-countries/{id}")
    public ResponseEntity<Void> deleteParticipatingCountry(@PathVariable("id") int id, ParticipatingCountry delete) {
        participatingCountryService.deleteParticipatingCountry(delete.getId());
        return ResponseEntity.noContent().build();
    }

}
