package com.raisetech.worldCup2022.controller;

public class ParticipatingCountryForm {

    private int id;
    private String name;
    private String continent;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public ParticipatingCountryForm(int id, String name, String continent) {
        this.id = id;
        this.name = name;
        this.continent = continent;
    }
}
