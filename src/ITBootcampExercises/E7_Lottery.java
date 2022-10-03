package ITBootcampExercises;

import java.util.Scanner;

public class E7_Lottery {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the first number in the range: ");
        int rangeMin = s.nextInt();
        s.nextLine();
        System.out.println("Please enter the second number in the range: ");
        int rangeMax = s.nextInt();
        s.nextLine();
        int randomNumber = rangeMin + (int) (Math.random()* ((rangeMax-rangeMin)+1));
        System.out.println("Enter your lucky number within the range: ");
        int luckyNumber = s.nextInt();
        s.nextLine();

        if (randomNumber == luckyNumber ) {
            System.out.println("Congratulations, you've won the lottery.");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
