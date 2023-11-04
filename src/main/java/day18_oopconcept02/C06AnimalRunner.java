package day18_oopconcept02;

public class C06AnimalRunner {

    public static void main(String[] args) {

        C02Mammal myDog = new C03Dog();
        System.out.println(myDog.weight);
        myDog.eat();

        int d = add2(3, 5);
        System.out.println(d);

        add(4, 6);


    }


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static int add2(int a, int b) {
        int c = a + b;
        return c;
    }
}