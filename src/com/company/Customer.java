package com.company;

import java.util.ArrayList;

public class Customer implements Age_verify {
    private int id,age;
    private String name;
    public ArrayList<Medication> purchasedMed = new ArrayList<>();


    public Customer(int id, int age, String name) {
        this.id = id;
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
}
