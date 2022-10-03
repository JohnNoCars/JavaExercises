package ITBootcampExercises;

import java.util.Locale;
import java.util.Scanner;

public class E4_DaysOfTheMonth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the name of the month to find out how many days it has: ");
        String month = s.nextLine();
        month = month.toLowerCase();


        switch (month) {
            case "april", "june", "september", "november":
                System.out.println("The " + month + " is 30 days long.");
                break;
            case "january", "march", "may", "july", "october", "december":
                System.out.println("The " + month + " is 31 days long.");
                break;
            case "february":
                System.out.println("Please enter the current year: ");
                int currentYear = s.nextInt();
                if(currentYear%4==0){
                    System.out.println("This year " + month + " is 29 days long.");
                } else{
                    System.out.println("This year " + month + " is 28 days long.");}
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }

    }

}
