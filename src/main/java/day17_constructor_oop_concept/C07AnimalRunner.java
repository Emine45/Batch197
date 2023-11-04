package day17_constructor_oop_concept;

public class C07AnimalRunner {

    public static void main(String[] args) {

        C04Cats myCat = new C04Cats();
        myCat.eat();
        myCat.drink();
        myCat.meow();


        C05Dogs myDogs = new C05Dogs();
        myDogs.eat();
        myDogs.drink();
        myDogs.bark();

        C06Birds myBirds = new C06Birds();
        myBirds.eat();
        myBirds.drink();
        myBirds.tweet();
    }
}
