package day04_operations_increment_decrement;

import java.util.Scanner;

public class C01ScannerClass {

    public static void main(String[] args) {

        //Example 5: Type code gets mile from user then converts it to kilometers 1 mile is 1.6 km

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance in miles to be converted to km :...");
        double distance = input.nextDouble();
        double distanceInKm = 1.6*distance;
        System.out.println("The distance is: " + distanceInKm + "km");

    }
}
