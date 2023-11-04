package day03concatenation_scannerclass;

import java.util.Scanner;

public class C07ScannerClass06 {
    //Example 4: Ask user to enter 5 digit integer like 45678
    //           Type code to print the sum of the first two and the last two numbers
    //           45678 ==> 45 + 78 = 123
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digit number:...");
        int number = input.nextInt();
        // To get first two digits we can divide the number by 1000
        int firstTwo = number/1000;//45
        // To get last two digits we use special operation called "modulus operator" , (%100)
        int lastTwo = number % 100;
        int sum = firstTwo+lastTwo;
        System.out.println("Sum of first two and last two digits of "+ number + " is = "+ sum);
    }
}