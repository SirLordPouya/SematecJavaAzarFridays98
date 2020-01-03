package com.sematec.azar.lib;

// PascalCase
public class MyClass {

    int a = 123; // integer
    String s = "Qoli";
    double d = 3.14;
    boolean b = false;

    char someChar;


    /*
    char c = 'Q';
    float fo = 5.14f;
    long l = 345;
    short aShortNumber = 10;
    byte aByte = 10;
*/

    // camelCase
    static int power(int x) {
        int result = x * x;
        return result;
    }


    int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    static double getP() {
        return 3.14;
    }

    static void printName(String name) {
        System.out.println(name);
    }


    static void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        int result = power(5);
        System.out.println(result);

        printName("Qoli");
        printHello();
    }
    //      /       slash
    //      \       back slash
    //      -       hyphen
    //      :       colon
    //      ;       semi-colon
    //      '       single quotation
    //      "       double quotation
    //      |       pipe line
    //      &       ampersand
    //      #       sharp
    //      ()      parantez
    //      []      brace
    //      {}      curly brace
    //      _       under line
    //      ~       tilda
    //      ,       comma
}
