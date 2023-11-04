package day07_string_manipulations;

public class C05StringManipulations05 {

    public static void main(String[] args) {
        // "\\p{Punct}"
        //Example 6: Type a code to find the number of punctuation marks used in a String.
        //           "Wooow!... Toms is 13, and he is in university...????"
        String sentence = "Wooow!... Toms is 13, and he is in university...????";
        String newSentence = sentence.replaceAll("[^\\p{Punct}]","");
        //System.out.println(newSentence);
        int numOfPunc = newSentence.length();
        System.out.println(numOfPunc);

        //Example 7: Type a code to find the number of words used in a String
        //           "Learn Java, earn huge amount of money." ==> 7

        // first method:  count number of spaces and add 1
        String s1 = "Learn Java, earn huge amount of money.";
        int numOfSpace = s1.trim().replaceAll("[^ ]","").length();
        int numWords = numOfSpace + 1;
        System.out.println("numWords = " + numWords);

        // second method by split() method:
        int numberOfWords2 = s1.trim().split(" ").length;
        System.out.println(numberOfWords2);


    }

}
