package ITBootcampExercises;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Scanner;

public class E28_MinAndMaxValuesInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        System.out.println("Enter the length of your array: ");
        int length = s.nextInt();

        int[] arr = new int[length];


        for (int i = 0; i<length; i++){
            System.out.println("Enter a number: ");
            arr[i]=s.nextInt();
        }
        System.out.println("Your array is: " + Arrays.toString(arr));
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;


        for(int i = 0; i<length; i++){
            if (arr[i]<smallest){
                smallest = arr[i];

            } else if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The minimum value in your array is "+smallest+", and the maximum is "+largest+".");


    }
}
