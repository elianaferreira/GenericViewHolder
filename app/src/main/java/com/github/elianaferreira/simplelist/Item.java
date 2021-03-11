package com.github.elianaferreira.simplelist;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private int image;
    private String label;
    private String description;

    public Item(int image, String label, String description) {
        this.image = image;
        this.label = label;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public static List<Item> populateList() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.blue, "Blue", "Palette for light blue color."));
        list.add(new Item(R.drawable.orange, "Orange", "Palette for orange color."));
        list.add(new Item(R.drawable.purple, "Purple", "Palette for purple color."));
        return list;
    }
}
