package day11_arrays;

import java.util.Arrays;

public class C03Arrays04 {

    public static void main(String[] args) {

        // Note: 1
        // split() mtd returns Array

        String str = "Learn Java earn money";
        String[] arr=  str.split("a");
        System.out.println(Arrays.toString(arr));  // [Le, rn J, v,  e, rn money]

        // Note:2 Arrays.equals() method is used to check if arrays are the same (element and their order are the same)

        int[] a = {1, 3, 5, 8};
        int[] b = {1, 3, 5, 8};
        int[] c = {1, 5, 3, 8};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a, c));

    }

}
