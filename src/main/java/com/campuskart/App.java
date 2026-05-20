package com.campuskart;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addition = calculator.add(10, 20);
        int subtraction = calculator.subtract(20, 10);

        System.out.println("Addition Result: " + addition);
        System.out.println("Subtraction Result: " + subtraction);
    }
}