package com.raisetech.worldCup2022.controller;

public class ParticipatingCountryResponse {

    private int id;
    private String name;
    private String continent;

    public ParticipatingCountryResponse(int id, String name, String continent) {
        this.id = id;
        this.name = name;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }
}
