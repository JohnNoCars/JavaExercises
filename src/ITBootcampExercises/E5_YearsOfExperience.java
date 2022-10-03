package ITBootcampExercises;

import java.util.Scanner;

public class E5_YearsOfExperience {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        int currentYear = s.nextInt();
        System.out.println("Enter the year you started working as a programmer: ");
        int startOfWork = s.nextInt();
        int workExperience = currentYear - startOfWork;

        if (workExperience<= 4){
            System.out.println("You are a Junior Programmer.");
        } else if (workExperience<=8) {
            System.out.println();

        } else if (workExperience>9 && workExperience<45) {
            System.out.println("You are the president of your company.");

        } else if (workExperience>45 && workExperience<=50) {
            System.out.println("You should retire.");

        } else if (workExperience>50) {
            System.out.println("This is nearly impossible. Please start over and enter a valid number.");
        }
    }
}
