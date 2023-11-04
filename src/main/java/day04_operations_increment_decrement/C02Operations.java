package day04_operations_increment_decrement;

public class C02Operations {

    public static void main(String[] args) {

        // '=' Assignment Operator: assign value on the right to the value on the left
        // '==' Equality Operator: It compares value on the right with value on the left
        //                        It returns boolean.
        //   2+4 == 6 ==> true    3 + 7 == 5 ==> false
        System.out.println(2+4 == 6);
        System.out.println(3 + 7 == 5);
        // If I use char with mathematical operators Java will use its ASCII value
        System.out.println('A'==65);
        System.out.println('A' + 'a');

        // Example: Find ASCII value of '!' by typing codes
        System.out.println('!'*1);
        System.out.println('!'+0);

        // '!'  Not Operator:   !true = false     !false = true     !!true = true

        // '!=' Not Equal Operator: 3+2 != 10 ==> true    3 + 2 != 5 ==> false

        // '>' , '<' , '<=' , '>=' return boolean  5<7 ==> true

        // '==' for String
        //  For String values there are two important part : 1) value  2) address

        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
    }

}