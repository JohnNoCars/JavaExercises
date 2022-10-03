package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E31_ReverseOrderOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        System.out.println("Enter the length of the initial array: ");
        int n = s.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter a number: ");
            arr[i]=s.nextInt();
            if (i==arr.length-1){
                System.out.println("Enter 'continue' if you'd like to add 5 more elements to your array: ");
                input = s.next();
                if (!input.equalsIgnoreCase("continue")){
                    break;
                } else{
                    int [] arr1 = new int[arr.length+5];
                    for (int j = 0;j<arr.length;j++ ){
                        arr1[j]=arr[j];
                    }
                    arr=arr1;
                }
            }

        }
        System.out.println("The current array is: " + Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
        for(int i = arr.length-1, j = 0; i>=0;i--,j++){
            arr2[j]=arr[i];

        }
        System.out.println("The reverse order of your array is: " + Arrays.toString(arr2));
    }
}
