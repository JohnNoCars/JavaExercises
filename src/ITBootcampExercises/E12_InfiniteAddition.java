package ITBootcampExercises;

import java.util.Scanner;

public class E12_InfiniteAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        double userNumber;
        int sum = 0;

        do {
            System.out.println("Enter a number: ");
            userNumber = s.nextDouble();
            sum+=userNumber;

            System.out.println("Terminate the program by typing 'end', to continue enter anything: ");
            input = s.next().toLowerCase();
            if (input.equals("end")) {
                System.out.println("Goodbye!");
            }
            System.out.println("The latest sum is: " + sum + ".");
        } while (!input.equals("end"));

    }
}
