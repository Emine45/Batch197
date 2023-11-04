package day03concatenation_scannerclass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05ScannerClass04 {

    public static void main(String[] args) {

        ///Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter width and length of a rectangle");
        double width = input.nextDouble();
        double length = input.nextDouble();
        double area = width * length;
        double parameter = 2 * (length + width);

        System.out.println("area = " + area);
        System.out.println("parameter = " + parameter);


    }
}
