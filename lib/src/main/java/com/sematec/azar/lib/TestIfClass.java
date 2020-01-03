package com.sematec.azar.lib;

public class TestIfClass {

    public static void main(String[] args) {
        int age = 20;

        if (age > 0 && age <= 10) { //AND
            System.out.println("Kid");
        } else if (age > 10 && age < 20) {
            System.out.println("Teenage");
        } else if (age >= 20 && age <= 39) {
            System.out.println("Young");
        } else if (age > 39 && age < 60) {
            System.out.println("MidAge");
        } else {
            System.out.println("Old");
        }

        if (age < 0 || age > 180) { //OR
            System.out.println("Invalid age!");
        }


    }
}
