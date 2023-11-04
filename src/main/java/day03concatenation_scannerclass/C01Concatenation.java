package day03concatenation_scannerclass;
public class C01Concatenation {
    public static void main(String[] args) {
        // Concatenation: It is process of adding String values or String with other data types
        //            Symbol we use is "+"
        String name = "Tom";
        String lastName = "Hanks";
        String fullName = name +" "+ lastName;
        System.out.println("fullName = " + fullName);
        System.out.println("Tom" + "Hanks");
        System.out.println("Tom " + "Hanks");
        System.out.println("Tom" + " Hanks");
        System.out.println("Tom" +" "+ "Hanks");
        System.out.println("Tom" + 5 + 10);//Tom510
        System.out.println("Tom" + (5 + 10));//Tom15
        System.out.println("Tom" + 5*10);// Tom50
        System.out.println(5+10+"Tom");//
        System.out.println(3 + 5 * 3 + "Tom" + 2 + 6);
    }
}