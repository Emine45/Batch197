package day07_string_manipulations;

public class C01StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
        //           1234 1234 1234 1234 ==> **** **** **** 1234

        String ccNum = "1234 1234 1234 1234";
        String first = ccNum.substring(0,15).replaceAll("[0-9]","*");
        String second = ccNum.substring(15);

        String hiddenCcNum = first + second;

        String hiddenCcNum2 = first.concat(second);

        System.out.println(hiddenCcNum);
        System.out.println(hiddenCcNum2);

        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."

        String str = "Tom Hanks was born in 1975.";
        int numOfChars = str.replace(" ", "").length();

        System.out.println(numOfChars);

        // replace(): It replaces chars or sequence of chars
        // replaceAll(): Works with regex if you need to use regex use replaceAll
        // concat() : Concatinate two strings

    }

}