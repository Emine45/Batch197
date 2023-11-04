package day08_for_loops;

public class C04ForLoop03 {

    public static void main(String[] args) {

        // Example: 6 Type code to reverse given String (Interview question)
        // "Alexa" -----> "axelA"

        String s = "Alexa";
        String reversed ="";


        for(int i = s.length()-1; i>=0; i--){

            reversed=reversed + s.charAt(i);

        }
        System.out.println(reversed);

        // Example: 7 Type code to find sum of the digits in a given integer.
        //    587 ----> 5+8+7 = 20

        int num = 587;
        int sumOfDigits = 0;

        for (int i = num; i>0 ; i/=10){
            sumOfDigits = sumOfDigits + i%10;
        }
        System.out.println("sumOfDigits = " + sumOfDigits);

        // Example : 8 Type code to find unique chars in a given String
        // "Hello"  ----> Heo

        String word = "Hello";
        String unique = "";

        for (int i =0; i<word.length();i++){

            char ch = word.charAt(i);

            if(word.indexOf(ch)==word.lastIndexOf(ch)){

                unique = unique+ ch;
            }
        }
        System.out.println("unique = " + unique);


    }
}
