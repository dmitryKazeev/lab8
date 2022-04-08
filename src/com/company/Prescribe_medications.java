package com.company;

import java.util.ArrayList;

public class Prescribe_medications extends Customer {
    public ArrayList<Medication> prescribe_med = new ArrayList<>();

    public Prescribe_medications(int id, int age, String name) {
        super(id, age, name);
    }
    public Prescribe_medications(int age, String name) {
        super(age, name);
    }

    public void customerInf(){
        System.out.printf("ID: %d\tName: %s\tAge: %d\n\n",getId(),getName(),getAge());
    }
}
