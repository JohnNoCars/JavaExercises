package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E27_PrintOutAllEvenNumbersWithOddIndexes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        int j = 0;

        int[] arr = new int[5];

        while(true){
            System.out.println("Enter a number: ");
            arr[j] = s.nextInt();
            j++;

            if(j==arr.length){
                System.out.println("Enter 'continue' to input more numbers into the array or 'done' to terminate the program: ");
                input = s.next();
                if(input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    int [] arr1 = new int[arr.length*2];
                    for (int i = 0; i <arr.length; i++){
                        arr1[i]=arr[i];

                    }
                    arr=arr1;

                }

            }

        }
        System.out.println("Your array is: " + Arrays.toString(arr));
        int [] arr2 = new int[arr.length];

        int k = 0;

        for (int i = 0; i<arr.length; i++) {
            if (i%2!=0){
                arr2[k]=arr[i];
                k++;
            }
        }
        int []arr3 = new int[k];

        for (int i = 0; i<k; i++){
            arr3[i]=arr2[i];
        }
        System.out.println("The numbers with odd indexes are: " + Arrays.toString(arr3));

    }
}
