package com.example.listadinamica;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listadinamica.databinding.ActivityListaBinding;
import com.example.listadinamica.databinding.ItemLayoutBinding;

public class ItemViewHolder extends RecyclerView.ViewHolder {
//    private final TextView tvText;
//    private final ConstraintLayout clContainer;

    ItemLayoutBinding binding;

  /*  public ItemViewHolder(@NonNull View itemview) {
        super(itemview);   */

      public ItemViewHolder(ItemLayoutBinding b) {
        super(b.getRoot());
        binding = b;

  /*    tvText = itemView.findViewById(R.id.tvText);
        clContainer = itemView.findViewById(R.id.container);   */

//        tvText = itemView.findViewById(R.id.tvText);
//        clContainer = itemView.findViewById(R.id.container);

    }

    public void setupItemView(String text, int colorBackground) {
          binding.tvText.setText(text);
          binding.containerlv.setBackgroundColor(colorBackground);
    }

    public TextView getTextViewBinding() {
          return binding.tvText;
    }

//    public TextView getTvText() {
//        return tvText;
//    }
//    public ConstraintLayout getConstraintLayout() {
//        return clContainer;
//    }
}
