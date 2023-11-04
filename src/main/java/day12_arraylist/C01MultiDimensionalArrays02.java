package day12_arraylist;

import java.util.Arrays;

public class C01MultiDimensionalArrays02 {

    public static void main(String[] args) {

        // Example 2: Print elements that has "a" in it from a multidimensional Array
        String[][] c = {{"Java"},{"is", "easy"},{"to","learn"}};


        for (String[] w: c){
            for (String u:w){
                if (u.contains("a")){

                    System.out.print(u + " ");
                }
            }
        }
        System.out.println();

        //Example 3: Type code to find the maximum and minimum elements in a 2-dimensional integer array
        int[][] n = { {5, 2}, {14, 9}, {-7} };
        int maximum = n[0][0];
        int minimum = n[0][0];
        for (int[] w: n){
            for (int u: w){
                maximum = Math.max(maximum,u);
                minimum = Math.min(minimum,u);
            }
        }
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);


        //Example 4: Type code to convert a multidimensional array to a one dimensional array
        //           { {5, 2}, {14, 9}, {-7} } ==> { 5, 2, 14, 9, -7 }
        int [][] d = { {5, 2}, {14, 9}, {-7} };

        int idx= 0;
        int i =0;
        for (int [] w:d){
            idx = idx + w.length;
        }

        int [] newD = new int[idx];  // { 0, 0, 0, 0, 0 }
        // { {5, 2}, {14, 9}, {-7} }
        for (int[] u:d){
            for (int k: u){
                newD[i] = k;
                i++;
            }
        }

        System.out.println(Arrays.toString(newD));

    }

}

