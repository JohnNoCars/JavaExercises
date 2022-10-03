package ITBootcampExercises;

import java.util.Scanner;

public class E3_WeekdaysWhenWeHaveClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the day of the week: ");
        String dayOfTehWeek = s.nextLine();
        dayOfTehWeek = dayOfTehWeek.toLowerCase();

        switch (dayOfTehWeek) {
            case "monday", "tuesday", "thursday", "friday" -> System.out.println("We have class today.");
            case "wednesday", "saturday", "sunday" -> System.out.println("We don't have class today.");
            default -> System.out.println("Invalid entry.");
        }
    }
}
