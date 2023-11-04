package day19_oopconcert03;

public class C03Dog extends C02Mammal{

    @Override // @Override Annotation checks for override rules...
    public void eat() {
        System.out.println("Dogs eat.....");
    }

    @Override
    public int getWeight() {
        return 7;
    }

    @Override
    public C03Dog create() {
        return new C03Dog();
    }

    @Override
    public void feed() {
        System.out.println("Dogs feed their kids with milk...");
    }
}
