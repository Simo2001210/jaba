/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m1.s2;

// java.lang is implicitly imported!
// import java.lang.System;

/**
 * A Java "Hello world"
 * 
 * @author Emanuele Galli
 */
public class Simple {
    /**
     * Just to say hello
     * 
     * @param args when passed, the first argument is printed
     */
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Ciao ");

        // output is based on input arguments
        if (args.length == 1) {
            System.out.println(args[0]);
        }
    }
}
