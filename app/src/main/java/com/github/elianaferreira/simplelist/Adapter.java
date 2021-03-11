package com.github.elianaferreira.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.github.elianaferreira.viewholder.GenericViewHolder;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<GenericViewHolder> {

    Context context;
    List<Item> dataSet;

    public Adapter(Context context, List<Item> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new GenericViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenericViewHolder holder, int position) {
        Item item = dataSet.get(position);
        holder.get(R.id.item_logo, ImageView.class).setImageDrawable(context.getResources().getDrawable(item.getImage()));
        holder.get(R.id.item_title, TextView.class).setText(item.getLabel());
        holder.get(R.id.item_description, TextView.class).setText(item.getDescription());

        holder.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.getLabel() + " selected.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
