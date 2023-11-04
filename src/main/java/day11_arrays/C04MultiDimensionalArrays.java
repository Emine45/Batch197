package day11_arrays;

import java.util.Arrays;

public class C04MultiDimensionalArrays {

    public static void main(String[] args) {

        // How to create a multidimensional Array:
        int [][] a = new int [3][2];
        // {{0,3},{0,0},{0,0}}

        // How to print multi dimentional Array on the console:

        System.out.println(Arrays.deepToString(a));

        // How to assign values to mult. Array:
        a[0][1]= 3;
        a[0][0]= 2;
        a[1][0]= 1;
        a[2][1]= 4;
        a[1][1]= 5;
        a[2][0]= 7;

        System.out.println(Arrays.deepToString(a));

        // Example 1: Type code to find total number of elements in a multidimentional Array
        String[][] b = {{"X","T"},{"m"},{"C","A","P"}};

        int numElements= 0;
        for (String[] w: b){
            numElements = numElements + w.length;
        }
        System.out.println(numElements);


        // Example 2: Print elements that has "a" in it from a multidimensional Array
        String[][] c = {{"Java"},{"is", "easy"},{"to","learn"}};


    }

}

