package Practice;

public class P02_StringManipulation {

    public static void main(String[] args) {

        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
        //           1234 1234 1234 1234 ==> **** **** **** 1234


        String ccNum = "1234 1234 1234 1234";
        String first = ccNum.substring(0,15).replaceAll("[1-9]", "*");
        System.out.println(first);

        String second = ccNum.substring(15);
        System.out.println(second);

        System.out.println(first+ second);




        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."

        String str = "Tom Hanks was born in 1975.";
        System.out.println("Before space " + str.length());
        int numOfChar = str.replace(" ", "").length();
        System.out.println("After space " + numOfChar);

    }
}
