package com.company;

public class Restriction extends Medication {

    private boolean ageRestriction;
    private boolean prescribeRestriction;

    public Restriction(int id_med, String name, double price) {
        super(id_med, name, price);
    }
    public Restriction(String name, double price, boolean ageRestriction, boolean prescribeRestriction) {
        super(name, price);
        ageRestriction=this.ageRestriction;
        prescribeRestriction=this.prescribeRestriction;
    }


    @Override
    public boolean check_restriction() {
        return false;
    }

    public boolean isAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(boolean ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public boolean isPrescribeRestriction() {
        return prescribeRestriction;
    }

    public void setPrescribeRestriction(boolean prescribeRestriction) {
        this.prescribeRestriction = prescribeRestriction;
    }


}
