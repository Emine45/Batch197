package day23_exceptions;

import java.util.Scanner;

public class C01Exceptions01 {

    public static void main(String[] args) {

        int totalPrice = 1200;
        System.out.println(instalmentPayment(totalPrice));
        System.out.println("Do you want to continue?");
    }

    public static int instalmentPayment(int price){
        int numOfInstalments;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter number of instalments you prefer...");
        numOfInstalments = input.nextInt();
        if(numOfInstalments==0){
            return price;
        }
        return price/numOfInstalments;
    }
}