package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PharmacyManager {

    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Category> categories = new ArrayList<>();
    public static ArrayList<Medication> medications = new ArrayList<>();

    static Scanner in = new Scanner(System.in);

    public static void allMed(){
        for (Medication i: medications) {
            i.medInf();
        }
    }

    public static Medication medSearch(String name){
        Medication temp=null;
        for (Medication i: medications
             ) {
            if (i.getMedName()==name){
                System.out.println("A cure has been found!");
               temp=i;
                break;
            }
        }
        return temp;
    }


    public static void prescriptionAdd(Prescribe_medications current){
        boolean exit=false;
        do {
            System.out.println("Find by Name-1 Select from the list-2");
            String temp = in.next();
            if (temp.equals("1")){
                System.out.println("Enter Medication Name: ");
                String name= in.next();
                medSearch(name).medInf();
                current.prescribe_med.add(medSearch(name));
            }
        }while (!exit);

    }

    public static void addCustomer(){
        boolean exit = false;
        do {
            System.out.println("Adding a new customer\n");
            System.out.print("Age: ");
            int age = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            Customer current = new Prescribe_medications(age,name);
            customers.add(current);
            System.out.println("Are there any prescriptions written by a doctor? y-yes n-no");
            String temp = in.next();
            if(temp.equals("y")){


            }

        }while (!exit);
    }
}
