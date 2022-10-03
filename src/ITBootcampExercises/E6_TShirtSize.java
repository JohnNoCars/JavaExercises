package ITBootcampExercises;

import java.util.Scanner;

public class E6_TShirtSize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the size of the T-shirt in centimeters: ");
        int sizeOfShirt = s.nextInt();
        s.nextLine();

        switch (sizeOfShirt) {
            case 24:
                System.out.println("The size is Small.");
                break;
            case 30:
                System.out.println("The size is Medium.");
                break;
            case 36:
                System.out.println("The size is Large");
                break;
            case 42:
                System.out.println("The size is ExtraLarge");
                break;
            default:
                System.out.println("You've entered an invalid size.");
                break;
        }
    }
}
