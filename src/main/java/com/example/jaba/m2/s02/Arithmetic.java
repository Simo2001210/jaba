/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s02;

/**
 * Arithmetic operators
 */
public class Arithmetic {
    /**
     * Basic numeric operations
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.print("10 + 3 = ");
        System.out.println(a + b); // 13

        System.out.print("10 - 3 = ");
        System.out.println(a - b); // 7

        System.out.print("10 * 3 = ");
        System.out.println(a * b); // 30

        System.out.print("10 / 3 = ");
        System.out.println(a / b); // 3

        System.out.print("10 % 3 = ");
        System.out.println(a % b); // 1

        // Type range
        System.out.print("Overflow! 1_000_000 * 3_000 = ");
        System.out.println(1_000_000 * 3_000); // -1294967296

        System.out.println("---");
//        System.out.println(a / 0); // ArithmeticException

        double c = 3.0;

        System.out.print("10 + 3.0 = ");
        System.out.println(a + c); // 13.0

        // Floating point division
        System.out.print("10 / 3.0 = ");
        System.out.println(a / c); // 3.3333333333333335

        System.out.print("10 % 3.0 = ");
        System.out.println(a % c); // 1.0

        // Real numbers are not always precisely represented
        System.out.print("3.0 - 2.1 = ");
        System.out.println(c - 2.1); // 0.8999999999999999

        // Divide by zero for real numbers leads to infinity
        System.out.print("3.0 / 0 = ");
        System.out.println(c / 0); // Infinity

        // implicit widening -> explicit narrowing
        System.out.println("--- adding bytes we get an int! ---");
        byte aByte = 6;
        byte anotherByte = 42;
        byte resultingByte = (byte) (aByte + anotherByte);
        System.out.println(resultingByte);

        System.out.println("--- ... unless their are constants ---");
        final byte fb1 = 6;
        final byte fb2 = 22;
        resultingByte = fb1 + fb2;
        System.out.println(resultingByte);
    }
}
