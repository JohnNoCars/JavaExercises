package ImprovisedExercises;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        double weight = s.nextDouble();
        System.out.println("Enter your height in m: ");
        double height = s.nextDouble();
        double bmi = weight/Math.pow(height,2);
        System.out.println("With the weight of " + weight + "kg, and the height of " + height + "m, your BMI is: " + bmi + ". ");

        if (bmi<18.5){
            System.out.println("You are malnourished.");
        } else if (bmi>=18.5 && bmi<=24.99) {
            System.out.println("You have normal weight");

        } else if (bmi>=25 && bmi<=29.99) {
            System.out.println("You are overweight.");

        } else if (bmi>=30) {
            System.out.println("You are obese.");

        }
    }
}
