package day21_oopconcept05_static_keyword;

public class Teacher {

    static String yes_a ="Hello";
    String no_a = "World";
    static int yes_age =4;
    int no_age = 3;


    public Teacher() {
        System.out.println("Cont");
        this.no_age = no_age +2;
        yes_age++;

    }

    public void non_methodA() {
        System.out.println("no A method");

    }


    public static void Yes_MethodA() {
        System.out.println("yes A method");

    }

}
