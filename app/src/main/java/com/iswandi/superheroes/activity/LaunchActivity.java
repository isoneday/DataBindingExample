package com.iswandi.superheroes.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.iswandi.superheroes.R;
import com.iswandi.superheroes.databinding.LaunchBinding;
import com.iswandi.superheroes.repository.LaunchRepository;


public class LaunchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LaunchBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_launch);
        LaunchRepository repository = new LaunchRepository();
        binding.setLaunch(repository.getRandomLaunch());
    }
}
