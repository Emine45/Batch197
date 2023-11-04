package day04_operations_increment_decrement;

public class C04PostIncrementAndPreIncrement {

    public static void main(String[] args) {
        // When you ask java to do two operations at a time java would like to know which one to do first

        int age = 20;
        int age2 = 20;

        System.out.println(age);
        System.out.println("Before post : ");
        System.out.println(age++);
        System.out.println("After post: ");
        System.out.println(age);

        System.out.println(age2);
        System.out.println("Before pre: ");
        System.out.println(++age2);
        System.out.println("After pre: ");
        System.out.println(age2);

        // Post Increment
        int num1 = 32;
        int num2 = num1++;
        System.out.println("num2 = " + num2);// 32
        System.out.println("num1 = " + num1);// 33

        // Pre Increment
        int num3 = ++num1;
        System.out.println("num3 = " + num3);//34
        System.out.println("num1 = " + num1);//34

        // Post Decrement
        int length1 = 12;
        length1 -= 1;//11
        System.out.println(length1);//11

        int lentgh2 = 12;
        System.out.println(lentgh2);//12
        lentgh2 -= 1;//11

        // Post Increment
        int lentgth3 = 12;
        System.out.println(lentgth3--);//12
        System.out.println(lentgth3);//11

        // Pre Increment
        int length4 = --lentgth3;
        System.out.println(length4);

    }
}