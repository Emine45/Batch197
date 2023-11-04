package day09_loops;

import java.util.Scanner;

public class C08DoWhileLoop02 {

    public static void main(String[] args) {
        int i = 7;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        }
        while (i<11);
        System.out.println(sum);

        System.out.println("====");

        int k = 7;
        int sum2 = 0;
        while (k<11) {
            sum2 = sum2 + k;
            k++;
        }
        System.out.println(sum2);


        /*Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();


    }
}
