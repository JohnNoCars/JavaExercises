package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E23_ArrayUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=10;
        int[] arr = new int[n];

        for (int i =0; i<arr.length; i++){
            System.out.println("Enter the next element of your array: ");
            arr[i] = s.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(arr));
    }
}
