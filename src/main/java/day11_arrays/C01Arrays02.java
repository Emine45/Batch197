package day11_arrays;

import java.util.Arrays;

public class C01Arrays02 {

    public static void main(String[] args) {

        // Example: Find the difference between maximum and min value of array elements
        //  [8,12,34,10,78,19]

        int [] numbers = {8,12,34,10,78,19};

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int w: numbers){
            maximum = Math.max(maximum,w);
            minimum = Math.min(minimum,w);
        }
        System.out.println(maximum - minimum);

        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings

        String [] cities = {"New York", "London", "Toronto", "Dares Salaam", "Athens"};
        int numOfChars = 0;

        for (String w: cities){
            numOfChars = numOfChars + w.length();
        }
        System.out.println(numOfChars);

        /*
        NOTE:
        //Eger 1 tanesinin uzunlugunu bulmak istiyorsak
        // 1. YOL=

        String [] cities = {"New York", "London", "Toronto", "Istanbul", "Athens"};

        String city = cities[0];
        System.out.println(city.length());

        //2.YOL
        int sum =0;
        String[] charsInIstanbul = city.split("");
        for (String w:charsInIstanbul){
            sum = sum + w.length();
        }
        System.out.println(sum);
         */

        // Note: 1 Arrays can contain only "primitive data types" and "references"
        // Note : 2 String we use length() mtd but in Arrays we use length variable

        // Example: 4 [ 0, 2, 3 , 0, 12 ,0]  put zeros to the end ===> [2, 3, 12, 0, 0, 0]

        int[] nums = {0, 2, 3 , 0, 12 ,0};
        int[] newNums = new int[nums.length];
        int idx = 0;
        // {0, 2, 3 , 0, 12 ,0}
        for (int w: nums){

            if (w!=0){
                newNums[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newNums));

    }

}

