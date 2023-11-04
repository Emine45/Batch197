package day07_string_manipulations;

public class C03StringManipulations03 {

    public static void main(String[] args) {
         /*
            Example 4:Check if a password has the following conditions
                      i)It should not be empty
                      ii)It should not be just space
                      iii)It should not have spaces at the beginning and at the end
                      iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
                      v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        */
        String password = "A23giK";
        //i)It should not be empty
        boolean first = password.isEmpty(); // isEmpty() method checks if there are any chars including space
        System.out.println(first);

        //ii)It should not be just space
        boolean second = password.isBlank(); // isBlank() returns true if I type all spaces
        System.out.println(second);

        //iii)It should not have spaces at the beginning and at the end
        boolean third = password.trim().equals(password);
        System.out.println(third);

        //iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        boolean fourth = password.indexOf("i") == 4;
        System.out.println(fourth);

        //v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        boolean fifth = password.lastIndexOf("K") == 5;
        System.out.println(fifth);

        // First way to write message to user
        if (!first && !second && third && fourth && fifth) {
            System.out.println("Correct Password ...");
        } else {
            System.out.println("Invalid Password...");
        }
        // Second Way to give message to the user
        if (first) {
            System.out.println("Password can not be empty...");
        }
        if (second) {
            System.out.println("Password cannot have only spaces");
        }
        if (!third) {
            System.out.println("Password cannot start or end with space");
        }
        if (!fourth) {
            System.out.println("'i' sould be fifth char in the password");
        }
        if (!fifth) {
            System.out.println("'K' should be sixth char in the password");
        }
        if (!first && !second && third && fourth && fifth) {
            System.out.println("Correct Password ...");
        } else {
            System.out.println("Invalid Password...");
        }
    }
}