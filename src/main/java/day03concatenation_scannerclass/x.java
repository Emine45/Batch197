package day03concatenation_scannerclass;

public class x {

    public static void main(String[] args) {

        int a = 12;
        int b = 5;
        System.out.println("Before Swap = " + a);
        System.out.println("Before Swap = " + b);
        a = a + b;
		b = a - b;
		a = a - b;

        System.out.println(a);
        System.out.println(b);

        int a1 = 12;
        int b1 =5;
        int c1=0;
        System.out.println("Before Swap = " + a1);
        System.out.println("Before Swap = " + b1);

        c1=a1;
        a1=b1;
        b1=c1;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " +b1);



    }
}
