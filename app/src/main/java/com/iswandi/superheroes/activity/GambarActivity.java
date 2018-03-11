package com.iswandi.superheroes.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iswandi.superheroes.R;
import com.iswandi.superheroes.databinding.ActivityGambarBinding;
import com.iswandi.superheroes.databinding.AstronautItemBinding;

public class GambarActivity extends AppCompatActivity {

    private ActivityGambarBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_gambar);
       binding.edt2.setImageResource(R.drawable.apollo);
    binding.setTitle1("asdas");
//    binding.btnshow.setOnClickListener();
    }
}
