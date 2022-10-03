package ITBootcampExercises;

import java.util.Scanner;

public class E1_LegalAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your year of birth: ");
        int currentYear = 2022;
        int yearOfBirth = s.nextInt();
        int currentAge = currentYear-yearOfBirth;

        if (currentAge >= 18) {
            System.out.println("Legally, you are an adult.");
        } else if (currentAge<=0) {
            System.out.println("You have entered an inappropriate year of birth.");

        } else{
            System.out.println("You're still a minor.");
        }
    }


}
