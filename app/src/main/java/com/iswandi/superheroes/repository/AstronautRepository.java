package com.iswandi.superheroes.repository;

import com.iswandi.superheroes.model.Astronaut;

public class AstronautRepository {
    private Astronaut[] astronauts = {
            new Astronaut("Neil Armstrong", "https://starchild.gsfc.nasa.gov/Images/StarChild/scientists/armstrong.jpg", true),
            new Astronaut("Buzz Aldrin", "http://www.ufoevidence.org/cases/pictures/Aldrin8.jpg", false),
            new Astronaut("John Glenn", "http://media.nj.com/hudson_voices_impact/photo/astrojpg-2e0ab6f2a5044f2e.jpg", false),
            new Astronaut("Gene Cernan", "https://astronautscholarship.org/wp-content/uploads/2012/03/cernan2.jpg", false),
            new Astronaut("Jim Lovell", "https://avatars2.githubusercontent.com/u/16025686?s=460&v=4", false)
    };

    public Astronaut[] getAstronauts(){
        return astronauts;
    }
}
