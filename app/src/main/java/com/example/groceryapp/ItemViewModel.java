package com.example.groceryapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ItemViewModel extends RecyclerView.ViewHolder {
    TextView textViewItemName, textViewItemPrice;
    public ItemViewModel(@NonNull View itemView) {
        super(itemView);
        textViewItemName = itemView.findViewById(R.id.grocery_name);
        textViewItemPrice = itemView.findViewById(R.id.grocery_price);
    }
}
