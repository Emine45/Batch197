package day05_logicaloperations_ifstatement;

import java.util.Locale;
import java.util.Scanner;

public class C05IfStatement03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day");
        String day = input.next();

        if(day.equalsIgnoreCase("Monday")) {
            System.out.println("Week day");
        }else if(day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Week day");
        }else if(day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Week day");
        }else if(day.equalsIgnoreCase("Thursday")) {
            System.out.println("Week day");
        }else if(day.equalsIgnoreCase("Friday")) {
            System.out.println("Week day");
        }else if(day.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend day");
        }else if(day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend day");
        }else {
            System.out.println("Please enter valid day");
        }

        //Different way
        // Example 4: Type a code to decide given day is week day or weekend day
        // Monday ---> week day   Saturday -------> Weekend day

        System.out.println("Please Enter Name of a day...");
        String dayName = input.next();
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");
        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday")
                || dayName.equalsIgnoreCase("Sunday");
        if (isWeekDay){
            System.out.println(dayName + " is Week day");
        }else if(isWeekendDay) {
            System.out.println(dayName + " is Weekend day");
        } else {
            System.out.println("Please Enter a valid name of a day");
        }
        /*
        if (dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday")){
            System.out.println(dayName + " is Week day");
        }else if(dayName.equalsIgnoreCase("Saturday")
                    || dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(dayName + " is Weekend day");
        } else {
            System.out.println("Please Enter a valid name of a day");
        }
         */


    }
}
