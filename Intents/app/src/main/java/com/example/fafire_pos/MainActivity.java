package com.example.fafire_pos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.attribute.AttributeView;

public class MainActivity extends AppCompatActivity {

    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvCount = findViewById(R.id.tvHello);
        Button btCount = findViewById(R.id.button);
        btCount.setOnClickListener(view -> {
                    c += 1;
                    tvCount.setText(String.valueOf(c));
                }
        );

        Button btToast = findViewById(R.id.toast);
        btToast.setOnClickListener(view ->
                Toast.makeText(getApplicationContext(), " Mensagem ", Toast.LENGTH_LONG).show());
    }

}