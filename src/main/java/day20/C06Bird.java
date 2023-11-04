package day20;

public class C06Bird extends C03Animal{
    @Override
    public  void eat(){
        System.out.println("Birds eat.....");
    }

    @Override
    public void drink() {
        super.drink();
    }
}