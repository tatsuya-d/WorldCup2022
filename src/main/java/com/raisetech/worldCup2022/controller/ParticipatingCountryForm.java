package com.raisetech.worldCup2022.controller;

public class ParticipatingCountryForm {


    private String name;
    private String continent;


    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public ParticipatingCountryForm(String name, String continent) {

        this.name = name;
        this.continent = continent;
    }
}
