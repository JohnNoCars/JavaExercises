package ITBootcampExercises;

import java.util.Scanner;

public class E10_SumOfNumber1toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number n: ");
        int n = s.nextInt();
        int counter = 0;
        int result = 0;
        s.nextLine();

        while (counter<n) {
            counter++;
            result = result+counter;
        }
        System.out.println("The sum of all the numbers from 1 to " + n + " is: " + result);
    }
}
