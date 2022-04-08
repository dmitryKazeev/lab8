package com.company;

public abstract class Medication {
    protected int id_med;
    protected String name;
    protected double price;
    private static int idCount=0;

    protected Medication(int id_med, String name, double price) {
        this.id_med = id_med;
        this.name = name;
        this.price = price;
    }
    protected Medication(String name, double price) {
        this.id_med = idCount++;
        this.name = name;
        this.price = price;
    }

    public void medInf(){
        System.out.printf("Id: %d\tName: %s\tPrice: %.2f\n\n",id_med,name,price);
    }


    public String getMedName(){
        return name;
    }


    public abstract boolean check_restriction();



}
