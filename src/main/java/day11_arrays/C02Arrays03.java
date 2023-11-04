package day11_arrays;

import java.util.Arrays;

public class C02Arrays03 {

    public static void main(String[] args) {


        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3
        int arr [] = {12, 3, -3, 5, 23};

        for (int w: arr){
            if (w<5){
                System.out.print(w + " ");
            }
        }

        System.out.println();
        //Example 6: Check if a specific element exists in an array or not.
        int brr [] = {12, 3, 14, 5, 23};
        Arrays.sort(brr);  // { 3, 5, 12, 14 ,23}
        System.out.println(Arrays.binarySearch(brr, 14));  // binarySearch() mtd returns index of element
        // if you will use binarySearch() you need to sort() elements first
        // if elements are repeating do not use binarysearch()
        int r = Arrays.binarySearch(brr,11); // -3  ---> "-" means it does not exists
        System.out.println(r);                  //      ----> "3" means if ıt existed it would be 3rd element in the Array


    }
}


