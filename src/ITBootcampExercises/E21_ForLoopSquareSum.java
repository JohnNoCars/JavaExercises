package ITBootcampExercises;

import java.util.Scanner;

public class E21_ForLoopSquareSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int square = 0;
        int sum = 0;

        for (int i = 1; i!=0; i++){
            System.out.println("Please enter the number you'd like to square or '0' to terminate the program: ");
            x=s.nextInt();
            if(x==0){
                System.out.println("Goodbye!");
                break;
            }
            square = x*x;
            sum = square + sum;

            System.out.println("The current sum of squares is: " + sum + ". ");


        }
    }
}
