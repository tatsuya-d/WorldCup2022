package com.raisetech.worldCup2022.Controller;

public class UpdateForm {

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

    public UpdateForm(int id, String name, String continent) {
        this.id = id;
        this.name = name;
        this.continent = continent;
    }
}
