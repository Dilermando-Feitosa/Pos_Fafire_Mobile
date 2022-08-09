package com.example.fafire_pos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fafire_pos.databinding.ActivityChatTela1Binding;

public class TelaChatResposta extends AppCompatActivity {

    ActivityChatTela1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatTela1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String valor = getIntent().getStringExtra("key");
        binding.tvResponse.setText(valor);

    }
}