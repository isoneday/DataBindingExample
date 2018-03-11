package com.iswandi.superheroes.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


public class Message extends BaseObservable {
    private String transmission;

    @Bindable
    public String getTransmission(){
        return transmission;
    }

    public void setTransmission(String value){
        transmission = value;
        notifyChange();
    }
}
