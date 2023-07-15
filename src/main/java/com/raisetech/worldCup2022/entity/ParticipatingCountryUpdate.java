package com.raisetech.worldCup2022.entity;

public class ParticipatingCountryUpdate {

    private String name;
    private String continent;

    public ParticipatingCountryUpdate(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
