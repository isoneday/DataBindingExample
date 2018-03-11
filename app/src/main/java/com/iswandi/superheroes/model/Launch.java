package com.iswandi.superheroes.model;

import android.support.annotation.DrawableRes;


public class Launch {
    public final String launchName;
    @DrawableRes
    public final int launchGif;

    public Launch(String name, @DrawableRes int gif){
        launchName = name;
        launchGif = gif;
    }
}
