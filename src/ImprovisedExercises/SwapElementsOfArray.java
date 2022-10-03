package ImprovisedExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the desired length of the array: ");

        int n = s.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            System.out.println("Enter the " + i + ". element of the array: ");
            arr[i]=s.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(arr));
        System.out.println("Enter the first index: ");
        int index1 = s.nextInt();
        System.out.println("Enter the second index: ");
        int index2 = s.nextInt();
        int arr1 = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=arr1;
        System.out.println("The array with swapped elements on your indexes is: " + Arrays.toString(arr));
    }
}
