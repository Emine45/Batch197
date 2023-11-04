package day03concatenation_scannerclass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02ScannerClass01 {

    public static void main(String[] args) {

        // Scanner Class : When we need to get data from user we use Scanner Class
        // There are three steps to get input from user

        // First step : Create Scanner Class object
        Scanner input = new Scanner(System.in);

        //Second step: Write a message to user
        System.out.println("Please enter your age");

        // Third step : Get data from the user
        byte age = input.nextByte();

        System.out.println("Your age is : " + age);
    }
}
