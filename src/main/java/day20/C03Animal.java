package day20;

/*
      1) Concrete Method: Method that has body
         Abstract Method: Method that does not have body
     2) To make a method abstract:
        i) remove method body
        ii) add abstract keyword between access modifier and return type on the method
        iii) add abstract keyword on the Class Name
    3)  If "abstract method" is used all concrete child classes must override that method.
        If concrete method is used in abstract class it is not mandatory to override them
    4)  Java does not allow us to create object from Abstract classes
        Because "abstract classes" have some "abstract methods"
        "Abstract methods" are incomplete. This is causing an issue.
        Since it does nor have body it can not make an action.
    5) If an abstract method was overridden by concrete class,
        children of this concrete class may or may not override it.
    6) It is mandatory to override "abstract methods" in concrete child classes.
       It is not mandatory to override "abstract methods" in abstract child classes.
    7) Concrete classes accepts only concrete methods,
       Abstract Classes  can accept both concrete and abstract methods.
   8) Abstract methods can have "public", "protected" and "default" access modifiers.
      Abstract methods can not have "private" access modifier
  9)  What is a "Final Method" ?
        "final methods" are methods whose body cannot be changed
        Can we make "final method" abstract?
        "Final methods" must have body and cannot be updated
        Can we override "final method" ?
        No They cannot be updated
   10) Can we make "abstract method" static ?  ---> No

 */
public  abstract class C03Animal {

    public  abstract void eat();
    public void drink(){
        System.out.println("Animals drink...");
    }

}