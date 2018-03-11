package com.iswandi.superheroes;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iswandi.superheroes.activity.AstronautActivity;
import com.iswandi.superheroes.activity.LaunchActivity;
import com.iswandi.superheroes.activity.MessageActivity;
import com.iswandi.superheroes.activity.SpacecraftActivity;
import com.iswandi.superheroes.databinding.MainBinding;

public class MainActivity1 extends AppCompatActivity {
    MainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindEvents();
    }

    private void bindEvents() {
        binding.fab.setOnClickListener(vi -> {
            startActivity(new Intent(MainActivity1.this, LaunchActivity.class));
        });

        binding.buttonMessage.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity1.this, MessageActivity.class));
        });

        binding.buttonAstronaut.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity1.this, AstronautActivity.class));
        });

        binding.buttonSpacecraft.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity1.this, SpacecraftActivity.class));
        });
    }
}
