package com.company;

public class Restriction extends Medication {

    private boolean ageRestriction;
    private boolean prescribeRestriction;

    protected Restriction(int id_med, String name, double price) {
        super(id_med, name, price);
    }
    protected Restriction(String name, double price) {
        super(name, price);
    }


    @Override
    public boolean check_restriction() {
        return false;
    }
}
