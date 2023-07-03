package com.raisetech.worldCup2022.Controller;

import com.raisetech.worldCup2022.Entity.ParticipatingCountry;
import com.raisetech.worldCup2022.Mapper.ParticipatingCountryMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/participating-country")
    ResponseEntity<Map<String, String>> create(@RequestBody ParticipatingCountryResponse form) {
        // 登録処理は省略
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/participating-country")
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "id and name and continent was successfully created"));
    }
}
