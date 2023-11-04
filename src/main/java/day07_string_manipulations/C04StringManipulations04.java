package day07_string_manipulations;

public class C04StringManipulations04 {

    public static void main(String[] args) {
        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        // First step is get rid of $ sign:
        shirtPrice = shirtPrice.replace("$","");
        bookPrice = bookPrice.replace("$","");

        // Second step : convert string data to double data by Wrapper Class methods
        double doubleShirt = Double.valueOf(shirtPrice);
        double doubleBook = Double.valueOf(bookPrice);


        double sum = doubleBook + doubleShirt;
        System.out.println(sum);

    }

}
