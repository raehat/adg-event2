package com.example.groceryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewModel> {
    @NonNull
    ArrayList<ItemModel> list;
    Context context;

    public ItemAdapter(@NonNull ArrayList<ItemModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public ItemViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_card_view, parent, false);
        return new ItemViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewModel holder, int position) {
        holder.textViewItemName.setText(list.get(position).getItemName());
        holder.textViewItemPrice.setText(list.get(position).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
