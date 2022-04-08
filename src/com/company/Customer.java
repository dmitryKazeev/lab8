package com.company;

import java.util.ArrayList;

public class Customer implements Age_verify {
    private int id,age;
    private String name;
    private ArrayList<Medication> purchasedMed = new ArrayList<>();
    private static int idCount=0;


    public Customer(int age,String name) {
        this.id = idCount++;
        this.age = age;
        this.name = name;
    }
    public Customer(int age, int i, String name) {
        this.id = idCount++;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean ageVerify(){
        return age >= 18;
    }


    public ArrayList<Medication> getPurchasedMed() {
        return purchasedMed;
    }

    public void setPurchasedMed(ArrayList<Medication> purchasedMed) {
        this.purchasedMed = purchasedMed;
    }
}
