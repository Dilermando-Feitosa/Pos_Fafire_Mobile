package com.example.listadinamica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.listadinamica.databinding.ActivityListaBinding;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private CustomAdapter adapter;

    ActivityListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaBinding.inflate(getLayoutInflater());

    /*    setContentView(R.layout.activity_lista);   */
          setContentView(binding.getRoot());

        ArrayList<String> androidVersion = new ArrayList();
        androidVersion.add("Android 4 Ice Cream Sandwich");
        androidVersion.add("Android 4.1 Jelly Bean");
        androidVersion.add("Android 4.4 KitKat");
        androidVersion.add("Android 5 Lollipop");
        androidVersion.add("Android 6 Marshmallow");
        androidVersion.add("Android 7 Nougat");
        androidVersion.add("Android 8 Oreo");
        androidVersion.add("Android 9.0 Pie");
        androidVersion.add("Android 10 Q");

        String[] colors = getResources().getStringArray(R.array.colors);

        adapter = new CustomAdapter(androidVersion, colors);

     /*   RecyclerView recyclerView = findViewById(R.id.rvLista);  */
        RecyclerView recyclerView = binding.rvLista;

        recyclerView.setAdapter(adapter);
    }
}