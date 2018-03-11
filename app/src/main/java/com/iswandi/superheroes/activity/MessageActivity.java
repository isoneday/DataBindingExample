package com.iswandi.superheroes.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.iswandi.superheroes.R;
import com.iswandi.superheroes.databinding.MessageBinding;
import com.iswandi.superheroes.model.Message;


/**
 * Created by joshuarose on 4/19/16.
 */
public class MessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MessageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_message);
        binding.setMessage(new Message());
    }
}
