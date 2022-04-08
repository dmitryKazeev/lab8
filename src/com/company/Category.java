package com.company;

import java.util.ArrayList;

public class Category {
    private int id_cat;
    private String categoryName;
    public ArrayList<Medication> medications = new ArrayList<>();
    private static int idCount=0;


    public Category(int id_cat, String categoryName) {
        this.id_cat = id_cat;
        this.categoryName = categoryName;
    }
    public Category(String categoryName) {
        this.id_cat = idCount++;
        this.categoryName = categoryName;
    }
}
