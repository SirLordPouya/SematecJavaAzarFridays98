package com.sematec.azar.lib;

public class TestObjectClass {

    public static void main(String[] args) {
        //object || instance
        String s;
        Car pride = new Car();
        pride.start();
        pride.move();

        Car samand = new Car();
        samand.start();


        ChildClass child = new ChildClass();
        child.printAge(30);
        child.printName("Pouya");
        child.printHello();
    }
}
