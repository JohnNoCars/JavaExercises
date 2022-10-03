package ITBootcampExercises;

import java.util.Scanner;

public class E17_StringContainsOtherStringCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input;

        for (int i = 1; i!=0; i++){
            System.out.println("Please enter a string to check whether it contains the word 'cool' or 'end' to terminate the program: ");
            input = s.nextLine();
            input = input.toLowerCase();
            int length = input.split("cool").length-1;
            System.out.println("Your sentence contains " + length + " 'cools'.");
            System.out.println("");

            if (input.equals("end")){
                System.out.println("Thank you for choosing this program. Goodbye.");
                break;
            }
        }
    }
}
