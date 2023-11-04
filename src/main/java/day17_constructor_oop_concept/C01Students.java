package day17_constructor_oop_concept;

/*
1) To create object we need Constructor. Without const. it is impossible to create an object
2) When you create a Class Java creates const automatically
This invisible const is called as "default constructor"
3) If we want we can create several constructor
4) When we create a const default const is removed.
5) To create const with different parameters make your code flexible

Question: What is the different
*/
public class C01Students {
    String name = "Tom Hanks";
    int age = 13;
    private String stdId = "TM2010001";
    public void study(){
        System.out.println("Study hard...");
    }
    public void doSport(){
        System.out.println("Doing sports is good for health...");
    }
    // How to create const manually
    public C01Students() {
    }
    public C01Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    // How to create const with the help of IntelliJ
    public C01Students(String name) {
        this.name = name;
    }
    public C01Students(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }
}
