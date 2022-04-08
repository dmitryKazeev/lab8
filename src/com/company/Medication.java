package com.company;

public abstract class Medication {
    protected int id_med;
    protected String name;
    protected double price;


    public abstract boolean check_restriction();


}
