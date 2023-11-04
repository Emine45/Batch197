package day19_oopconcert03;

/*
    1)  To have specific implementations in child class we override on the method in parent class ----> Method Overriding
    2)  "Method Overriding" we change method body
        We don't change method name and parameters.
        Method name and parameters are "Method Signature" so we dont chane metd sign.
    3)  If return type of overridden (method in the parent class) is "void" dont change it in the overriding (method in the child class ) mthd
    4)  If return type is primitive data type dont touch it in method overriding
    5)  If return type has parent-child (Covariant data types )relationship we can change return type of overriding method to a narrower data type
    6) Access Modifier of child class should be same or wider than parent:

            Overriden method ----->     public
            Overriding Method----->     public

            Overriden method ----->     protected
            Overriding Method----->     protected or public

            Overriden method ----->     default
            Overriding Method----->     default , protected or public

            Overriden method ----->     private
            Overriding Method----->     we cannot override on private methods

    7) Polymorphism : Method Overloading + Method Overriding

    8)  What are the differences between overloading and overridding?
        i) "Method Overloading" occurs within the same class, "Method Overriding" needs multiple classes
        ii) "Method Overriding" uses inheritance, in "Method Overloading" there is no inheritance
        iii) "private methods" can be overloaded but cannot be overridden
        iv) In "Method Overriding" we cannot change Method Signature but in "Method Overloading" we can change.
        v)  "Method Overloading" access modifiers and return type they don't play a role,
            "Method Overriding" there are certain rules for access modifiers and return type
        vi) "Method Overloading" uses different parameters to handle different scenarios
            "Method Overriding" uses same method signature with different method body to make more specific implementations.

        vii) "static methods" can be overloaded but can not be overridden.

 */
public class C01Animal {
    public void eat(){
        System.out.println("Animals eat......");
    }

    public int getWeight(){
        return 62;
    }

    public C01Animal create(){
        //   C01Animal newAnimal = new C01Animal();
        //    return newAnimal;
        return new C01Animal();
    }


}