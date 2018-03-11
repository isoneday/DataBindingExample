package com.iswandi.superheroes.model;


public class Astronaut {
    public final String image;
    public final String name;
    public final boolean deceased;

    public Astronaut(String name, String image, boolean deceased){
        this.name = name;
        this.image = image;
        this.deceased = deceased;
    }
}
