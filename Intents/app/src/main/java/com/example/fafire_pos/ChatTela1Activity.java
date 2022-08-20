package com.example.fafire_pos;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fafire_pos.databinding.ActivityChatTela1Binding;

public class ChatTela1Activity<binding> extends AppCompatActivity {

    ActivityChatTela1Binding binding;

    ActivityResultLauncher<Intent> intentResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    String mensagem = result.getData().getStringExtra("ResposeKey");
                    if (mensagem != null && !mensagem.equals("")) {
                        binding.tvResponse.setText(mensagem);
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatTela1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btSend.setOnClickListener(view -> {
            String mensagem = binding.edMessage.getText().toString();
            binding.tvMessage.setText(mensagem);
            Intent mensageiro = new Intent(getApplicationContext(), TelaChatResposta.class);
            mensageiro.putExtra("key", binding.edMessage.getText().toString());

//            startActivity(mensageiro);

            intentResult.launch(mensageiro);

        });
    }
}