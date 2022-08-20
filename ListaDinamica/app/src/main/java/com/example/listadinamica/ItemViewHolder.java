package com.example.listadinamica;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvText;
    private final ConstraintLayout clContainer;

    public ItemViewHolder(@NonNull View itemview) {
        super(itemview);

        tvText = itemView.findViewById(R.id.tvText);
        clContainer = itemView.findViewById(R.id.container);
    }

    public TextView getTvText() {
        return tvText;
    }
    public ConstraintLayout getConstraintLayout() {
        return clContainer;
    }
}
