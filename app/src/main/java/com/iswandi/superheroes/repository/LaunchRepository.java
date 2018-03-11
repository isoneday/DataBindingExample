package com.iswandi.superheroes.repository;


import com.iswandi.superheroes.R;
import com.iswandi.superheroes.model.Launch;

import java.util.Random;


public class LaunchRepository {
    private Launch[] launches = {
        new Launch("Falcon 9", R.drawable.falcon_nine),
        new Launch("Atlantis", R.drawable.atlantis),
        new Launch("Apollo", R.drawable.apollo),
        new Launch("Atlantis", R.drawable.atlantis)
    };

    public Launch getRandomLaunch(){
        Random random = new Random();
        return launches[random.nextInt(launches.length)];
    }
}
