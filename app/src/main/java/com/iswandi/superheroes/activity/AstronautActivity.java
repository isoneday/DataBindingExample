package com.iswandi.superheroes.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.iswandi.superheroes.R;
import com.iswandi.superheroes.adapter.AstronautAdapter;
import com.iswandi.superheroes.databinding.AstronautListBinding;
import com.iswandi.superheroes.repository.AstronautRepository;

public class AstronautActivity extends AppCompatActivity {
    AstronautListBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_astronaut);
        setupRecycler();
    }

    private void setupRecycler() {
        binding.recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        AstronautRepository repository = new AstronautRepository();
        AstronautAdapter adapter = new AstronautAdapter(repository.getAstronauts());
        binding.recycler.setAdapter(adapter);
    }
}
