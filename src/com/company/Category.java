package com.company;

import java.util.ArrayList;

public class Category {
    private String categoryName;
    public ArrayList<Medication> medications = new ArrayList<>();


    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
