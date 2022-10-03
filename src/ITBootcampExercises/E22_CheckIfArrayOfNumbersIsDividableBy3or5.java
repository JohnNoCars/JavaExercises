package ITBootcampExercises;

import java.util.Scanner;

public class E22_CheckIfArrayOfNumbersIsDividableBy3or5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0;  i<n; i++) {
            System.out.println("Enter the next element of your array: ");
            arr[i] = s.nextInt();
        }


        for (int i = 0; i<arr.length; i++) {// arr.length is the same as n
            if (arr[i]%15==0) {
                System.out.println("Number " + arr[i] + " is dividable by both 3 and 5.");
            } else if (arr[i]%5==0) {
                System.out.println("Number " + arr[i] + " is dividable by 5.");

            } else if (arr[i]%3==0) {
                System.out.println("Number " + arr[i] + " is dividable by 3.");

            }
        }
    }
}
