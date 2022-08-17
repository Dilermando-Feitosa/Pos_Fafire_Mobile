package com.example.fafire_pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fafire_pos.databinding.ActivityChatTela1Binding;

public class ChatTela1Activity<binding> extends AppCompatActivity {

    ActivityChatTela1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatTela1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btSend.setOnClickListener(view -> {
            Intent mensageiro = new Intent(getApplicationContext(), TelaChatResposta.class);
            mensageiro.putExtra("key", binding.edMessage.getText().toString());
            startActivity(mensageiro);
        });
    }
}