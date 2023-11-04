package day19_oopconcert03;

public class C06StudentRunner {

    public static void main(String[] args) {

        C05Student std = new C05Student();
        System.out.println(std.getStId()); // TH001
        std.setStId("AC123");
        System.out.println(std.getStId()); // AC123
        std.setIllness("headache");
        System.out.println(std.getIllness()); // headache

    }

}


