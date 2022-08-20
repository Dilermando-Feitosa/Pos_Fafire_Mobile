package com.example.fafire_pos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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

        Intent respostaIntent = new Intent(this, ChatTela1Activity.class);
        binding.btSend.setOnClickListener(view -> {
            String resposta = binding.edMessage.getText().toString();
            binding.tvResponse.setText(resposta);
            respostaIntent.putExtra("ResponseKey", resposta);
            setResult(RESULT_OK, respostaIntent);
            finish();
        });
    }
}