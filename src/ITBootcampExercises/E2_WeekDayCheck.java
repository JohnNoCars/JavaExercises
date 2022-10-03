package ITBootcampExercises;

import java.util.Scanner;

public class E2_WeekDayCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter the number of the day of the week: ");
        int dayOfTheWeek = s.nextInt();

        switch (dayOfTheWeek){
            case 1 -> System.out.println("It's Monday today.");
            case 2 -> System.out.println("It's Tuesday today.");
            case 3 -> System.out.println("It's Wednesday today.");
            case 4 -> System.out.println("It's Thursday today.");
            case 5 -> System.out.println("It's Friday today.");
            case 6 -> System.out.println("It's Saturday today.");
            case 7 -> System.out.println("It's Sunday today.");
            default -> System.out.println("You've entered an invalid number.");
        }
    }
}
