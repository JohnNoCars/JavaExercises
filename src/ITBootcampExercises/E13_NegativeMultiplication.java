package ITBootcampExercises;

import java.util.Scanner;

public class E13_NegativeMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = s.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = s.nextInt();

        boolean negativeResult = false;

        if(firstNumber<0 && secondNumber>0 || firstNumber>0 && secondNumber<0){
            negativeResult=true;

            firstNumber = Math.abs(firstNumber);
            secondNumber = Math.abs(secondNumber);
        }


        double result = 0;



        for (int i = 0; i<firstNumber; i++) {
            result += secondNumber;
            if(negativeResult){
                System.out.println("The result is: -" + result + ".");
                break;
        }

        }System.out.println(result);

    }
}
