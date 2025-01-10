package com.codedifferently.labs.partA.ex02;

import java.util.Scanner;

public class NameMaker {
    public static String nameMaker(String firstName, String middleName, String lastName) {
        String response = "";
        String fullName;
        fullName=firstName+" "+middleName+" "+lastName;
        response += ("Your full name is "+ fullName);
        return response;
    }

    public static void main(String[] args) {
        String firstName = "";
        String middleName = "";
        String lastName = "";
        /* Put your code in between these comments : Top */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first name");
        firstName = keyboard.nextLine();
        System.out.println("Enter your middle name");
        middleName = keyboard.nextLine();
        System.out.println("Enter your last name");
        lastName = keyboard.nextLine();
        System.out.println(nameMaker(firstName, middleName, lastName));
        /* Put your code in between these comments : Bottom */
        String fullName  = nameMaker(firstName, middleName, lastName);
        System.out.println(fullName);
    }
}
