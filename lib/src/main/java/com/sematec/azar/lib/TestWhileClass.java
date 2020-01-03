package com.sematec.azar.lib;

public class TestWhileClass {

    public static void main(String[] args) {
        // while(condition){}

        int number = 20;

        while (number < 20) {
            System.out.println("Number is less than 20");
            number = number + 1;
        }

        //do while
        do {
            System.out.println("Number is less than 20");
            number = number + 1;
        } while (number < 20);




    }
}
