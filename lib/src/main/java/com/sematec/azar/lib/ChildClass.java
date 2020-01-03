package com.sematec.azar.lib;

public class ChildClass extends ParentClass {

    @Override
    public void printName(String name) {
        System.out.print("Welcome ");
        super.printName(name);
    }

    @Override
    public void printHello() {
        System.out.println("Bye!");
    }


    public void someFunction(){

    }
}
