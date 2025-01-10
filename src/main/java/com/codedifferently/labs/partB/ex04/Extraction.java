package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";
        System.out.println(greeting.substring(0,5));
        String x = greeting.substring(7,11);
        System.out.println(x);
        System.out.println(x + " is a good time!");
        /* Your code goes here*/


        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
