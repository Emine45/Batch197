package day08_for_loops;

public class C02ForLoop01 {

    public static void main(String[] args) {

        // Type five times Hi on the console:

        // Below structure is difficult to type, update and fix bugs in the code. And it has repetitions.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println();
        // Java created loop structure to handle repeated actions easily.
        // There are four types of loops in Java:
        // 1) For Loop  2) while Loop   3) Do while Loop  4) For Each Loop

        // For Loop:
        //    starting value    condition    increment/decrement
        for(   int i = 1      ;  i<6       ;       i++      ){

            System.out.println("Hi");


        }

        // Example: 2 Types numbers from 3 to 12 on the console , on the same line with space between them

        for (int i =3; i<13 ; i++ ){
            System.out.print(i+ " ");
        }

        System.out.println();

        for (int i=12 ; i>2 ; i--) {
            System.out.print(i + " ");
        }


    }

}


