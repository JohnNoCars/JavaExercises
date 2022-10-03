package ITBootcampExercises;

import java.util.Scanner;

public class E18_InfiniteAdditionForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=1;
        int result = 1;

        for(int i = 0; x!=0; i++){
            System.out.println("");
            System.out.println("Please enter the number you'd like to multiply or enter '0' to terminate the program: ");
            x = s.nextInt();
            x=Math.abs(x);
            result*=x;
            System.out.println("The current result is: " + result + ".");
        }
        System.out.println("The final result is: " + result + ". Thank you for using this program.");
    }
}
