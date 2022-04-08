package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PharmacyManager {

    public static ArrayList<Prescribe_medications> customers = new ArrayList<>();
    public static ArrayList<Category> categories = new ArrayList<>();
    public static ArrayList<Restriction> medications = new ArrayList<>();

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

    public static boolean setExit(){
        String temp=in.next();
        if(temp.equals("y")){
            return false;
        }
        if (temp.equals("n")){
            return true;
        }
        return false;
    }

    public static void allCategory(){
        for (Category i: categories
             ) {
            i.catInf();
        }
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
                System.out.println("Added successfully!");
                System.out.println("Add more? y-yes n-no");
                exit=setExit();
            }
            if (temp.equals("2")){
                allMed();
                System.out.println("Enter the Medication ID: ");
                int id = in.nextInt();
                medications.get(id).medInf();
                current.prescribe_med.add(medications.get(id));
                System.out.println("Added successfully!");
                System.out.println("Add more? y-yes n-no");
                exit=setExit();
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
            Prescribe_medications current = new Prescribe_medications(age,name);
            customers.add(current);
            System.out.println("Are there any prescriptions written by a doctor? y-yes n-no");
            String temp = in.next();
            if(temp.equals("y")){
                prescriptionAdd(current);
            }
            if (temp.equals("n")){
                exit=true;
            }
        }while (!exit);
    }
    public static void addMedication(){
        System.out.println("Adding a new medication\n");
        System.out.print("Name: ");
        String name = in.next();
        System.out.print("Price: ");
        double price = in.nextDouble();
        System.out.println("Is there an age limit on this medicine? y-yes n-no");
        String temp = in.next();
        boolean ageR = temp.equals("y");
        System.out.println("Do I need a prescription from a doctor to purchase this medicine? y-yes n-no");
        temp = in.next();
        boolean prescriptR = temp.equals("y");
        Restriction newMedication = new Restriction(name,price,ageR,prescriptR);
        allCategory();
        System.out.println("Select a product category by ID");
        int id = in.nextInt();
        medications.add(newMedication);
        categories.get(id).medications.add(newMedication);
        System.out.println("Added successfully!");
    }
    public static void addCategory(){
        System.out.println("Adding a new medication\n");
        System.out.print("Name: ");
        String name = in.next();
        Category newCat = new Category(name);
        categories.add(newCat);
    }
    public static void allCustomers(){
        for (Prescribe_medications i: customers
             ) {
            i.customerInf();
        }
    }

    public static void purchaseMed(){
        allCustomers();
        System.out.print("Customer ID:");
        int customerID=in.nextInt();
        Prescribe_medications current = customers.get(customerID);
        System.out.println("Medication: Find by Name-1 Select from the list-2");
        String temp = in.next();
        if (temp.equals("1")){
            System.out.println("Name: ");
            String name = in.next();
            medSearch(name).medInf();
            current.getPurchasedMed().add(medSearch(name));
            System.out.println("Added successfully!");
        }
        if (temp.equals("2")){
            allMed();
            int id = in.nextInt();
            medications.get(id).medInf();
            current.getPurchasedMed().add(medications.get(id));
            System.out.println("Added successfully!");
        }

    }
}

