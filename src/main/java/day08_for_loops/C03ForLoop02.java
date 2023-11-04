package day08_for_loops;

public class C03ForLoop02 {

    public static void main(String[] args) {

        // Example :3 Type even integers from 5 to 16 on the console

        for (int i = 5; i<17; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        // Example : 4 Type code to print all numbers between 5 and 16 but not 7 on the console

        // first way
        System.out.println();
        for (int i = 5; i<17 ; i++){

            if (i!=7){

                System.out.print(i + " ");
            }
        }

        // second way:
        for (int i = 5; i<17 ; i++){
            if (i==7){
                continue; // continue keyword is used to skip some values in loops
            }             // continue ketword takes you to increment part directly
            System.out.print(i + " ");
        }


        System.out.println();
        // Example: 5 Print String chars one by one on the console. If you see "x" stop printing
        // "I like extra effort"
        String s ="I like extra effort";

        for (int i = 0; i<s.length(); i++){

            if (s.charAt(i)=='x'){
                break;// "break" keyword stops looping and takes you outside the loop
            }
            System.out.print(s.charAt(i));
        }

    }

}

