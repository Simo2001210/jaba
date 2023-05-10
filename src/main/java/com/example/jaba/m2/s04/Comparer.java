/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s04;

/**
 * Comparison operators
 */
public class Comparer {
    /**
     * Comparison operators on primitives, and equals() on references
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int alpha = 12;
        int beta = 21;
        int gamma = 12;
        System.out.println("alpha = " + alpha);
        System.out.println("beta = " + beta);
        System.out.println("gamma = " + gamma);

        boolean result = alpha < beta; // true
        System.out.println("alpha < beta? " + result);

        result = alpha < gamma; // false
        System.out.println("alpha < gamma? " + result);

        result = alpha <= gamma; // true
        System.out.println("alpha <= gamma? " + result);

        result = alpha > beta; // false
        System.out.println("alpha > beta? " + result);

        result = alpha > gamma; // false
        System.out.println("alpha > gamma? " + result);

        result = alpha >= gamma; // true
        System.out.println("alpha >= gamma? " + result);

        result = alpha == beta; // false
        System.out.println("alpha == beta? " + result);

        result = alpha == gamma; // true
        System.out.println("alpha == gamma? " + result);

        result = alpha != beta; // true
        System.out.println("alpha != beta? " + result);

        result = alpha != gamma; // false
        System.out.println("alpha != gamma? " + result);

        // For references, == is _not_ about the content
        String a = "solution";
        // A string generated by copy outside the String pool
        String b = new String("solution");

        if (a != b) {
            System.out.println("The references a and b go to different objects");
        }
        if (a.equals(b)) {
            System.out.println("Still, a equals b!");
        }

        // If the literal is already in the String pool, no new String is created
        // Two references to the same object
        String c = "solution";
        if (a == c) {
            System.out.println("The references a and c go to the same object");
        }
        if (a.equals(c)) {
            System.out.println("So, a equals c");
        }
    }
}