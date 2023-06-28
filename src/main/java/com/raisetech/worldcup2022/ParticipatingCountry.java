package com.raisetech.worldcup2022;

public class ParticipatingCountry {

    private int id;
    private String name;
    private String continent;

    public ParticipatingCountry(int id, String name, String continent) {
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
