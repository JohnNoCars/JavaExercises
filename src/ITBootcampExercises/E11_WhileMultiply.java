package ITBootcampExercises;

import java.util.Scanner;

public class E11_WhileMultiply {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = s.nextInt();
        s.nextLine();
        System.out.println("Please enter the second number: ");
        int secondNumber = s.nextInt();
        s.nextLine();
        int counter = 0;
        int result = 0;

        while(counter<secondNumber){
            counter++;
            result += firstNumber;
        }
        System.out.println("When " + firstNumber + " and " + secondNumber + " are mutiplied, the result is " + result + ".");
    }
}
