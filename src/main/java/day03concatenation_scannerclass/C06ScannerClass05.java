package day03concatenation_scannerclass;

import java.util.Scanner;

public class C06ScannerClass05 {
    public static void main(String[] args) {

        // Example 3: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        // Then print them on the console in different lines with a label

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Please enter your heigth");
        double heigth = input.nextDouble();
        System.out.println("Please enter your marital status");
        String maritalStatus = input.next();

        System.out.println("FullName = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("Heigth = " + heigth);
        System.out.println("MaritalStatus = " + maritalStatus);

    }
}
