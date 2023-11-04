package Practice;

public class P01_StringManipulation {

    public static void main(String[] args) {

        // Example:3 Get initials from full name: (Middle names are excluded)
        // "Tom Hanks" ---->TH    "  toM Hanks  " --->TH    " tOm hAnKs " ----> TH

        String name2 = " tOm hAnKs ";

        String firstInitial = name2.trim().split(" ")[0].substring(0,1).toUpperCase();
        System.out.println(firstInitial);

        String secondInitial = name2.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(secondInitial);

        System.out.println(firstInitial+secondInitial);


    }
}
