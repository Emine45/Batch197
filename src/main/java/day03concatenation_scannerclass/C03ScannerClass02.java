package day03concatenation_scannerclass;

import java.util.Scanner;

public class C03ScannerClass02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Your full name is: " + fullName);


        System.out.println("Please enter only first name of your parent");
        String firstNameOfParent = input.next();
        System.out.println("Your parent's firstName is: " + firstNameOfParent);


    }


}
