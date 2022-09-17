package com.example.listadinamica;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listadinamica.databinding.ActivityListaBinding;
import com.example.listadinamica.databinding.ItemLayoutBinding;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private ArrayList<String> localDataSet;
    private String[] colors;

    public CustomAdapter(ArrayList<String> localDataSet, String[] colors) {

        this.localDataSet = localDataSet;
        this.colors = colors;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     /*   View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

          return new ItemViewHolder(view); */

        return new ItemViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));

    }

    private String getColor(int position) {
        return colors[position];
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
     /*   holder.getTvText().setText(localDataSet.get(position));
        holder.getConstraintLayout().setBackgroundColor(Color.parseColor(colors[position]));  */

        holder.setupItemView(localDataSet.get(position), Color.parseColor(colors[position]));

//        holder.getTextViewBinding().setText(localDataSet.get(position));
//        holder.getConstraintLayout().setBackgroundColor(Color.parseColor(colors[position]));

    }

    @Override
    public int getItemCount() {

        return localDataSet.size();
    }
}
