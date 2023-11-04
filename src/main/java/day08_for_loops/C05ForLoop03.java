package day08_for_loops;

public class C05ForLoop03 {

    public static void main(String[] args) {
        /*
        Example 7: Type code to print the following image on the console (Nested For Loop)
            X X X
            X X X
         */

        int column = 3;
        int row = 2;


        for (int i=0; i<row; i++){

            String s ="";

            for (int k =0; k<column; k++ ){

                s= s +"X ";
            }

            System.out.println(s);
        }

    }

}

