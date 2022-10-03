package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E24_CarRegister {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=5;
        String [] arr = new String[n];
        String input;

        for (int i =0; i<arr.length; i++){
            System.out.println("Enter the car brand you have in your shop: ");
            arr[i] = s.nextLine();
        }


        for (int i = 0; i<arr.length; i++) {
            System.out.println("Please enter the car brand you'd like to verify: ");
            input = s.nextLine();
            if (arr[i].equalsIgnoreCase(input)){
                System.out.println("This car is in your inventory!");
            } else {
                System.out.println("Unfortunately, you don't have this car in your inventory!");

            }
        }System.out.println("The: " + Arrays.toString(arr));
    }
}
