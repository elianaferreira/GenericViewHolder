package com.github.elianaferreira.viewholder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class GenericViewHolder extends RecyclerView.ViewHolder {

    public GenericViewHolder(View itemView) {
        super(itemView);
    }

    /**
     * Method to retrieve a view from itemView by its ID
     *
     * @param id
     * @param cls
     * @param <T>
     *
     * @return
     */
    public <T extends View> T get(int id, Class<T> cls) {
        View v = itemView.findViewById(id);
        T t = cls.cast(v);
        return t;
    }

    public View getView() {
        return itemView;
    }
}

