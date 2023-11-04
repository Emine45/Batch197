package day23_exceptions;

public class C03Exceptions03 {

    public static void main(String[] args) {

        String[] str = {"Uranus","Hulya","Cagatay","Selim"};
        printArrayElemnt(str,1); // Hulya
        printArrayElemnt(str,2); // Cagatay
        printArrayElemnt(str,4); // ArrayIndexOutOfBoundsException

        System.out.println((convertStringToInteger("125") + 1));
        System.out.println((convertStringToInteger("0") + 1));
        System.out.println((convertStringToInteger("-5") + 1));
        System.out.println((convertStringToInteger("12s5") + 1)); // NumberFormatException. Java throws NumberFormatException
        // when non-numerical chars are used for converting to Integer
    }

        // Create a method that prints an Array element in a given index on the console

    public static void printArrayElemnt(String [] s, int idx){
        try {
            System.out.println(s[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no element in the given index...");
            System.out.println(e.getMessage());
        }
    }

    // Create a method to convert given String to Integer
    public static Integer convertStringToInteger(String str){
        Integer result = 0;
        try {
            result =   Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            result= 0;
        }
        return result;
    }

}