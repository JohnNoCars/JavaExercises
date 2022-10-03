package ITBootcampExercises;

import java.util.Scanner;

public class E14_HowManyOsInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to check how many Os it has: ");


        while (true){
            String userSentence = s.nextLine();
            int numberOfOccurrences = (userSentence.split("o").length) -1;
            System.out.println("There are: " + numberOfOccurrences + " Os in this string.");
            System.out.println("Enter 'bye' to exit the program or anything else to continue: ");
            String input = s.nextLine();
            if (input.equalsIgnoreCase("bye")) {
                System.out.println("Goodbye!");
                break;
            }else {
                System.out.println("Enter another string: ");
            }
        }

    }
}
