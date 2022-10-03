package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E29_SwapElementsBasedOnIndex {
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
        System.out.println("Your array is: " + Arrays.toString(arr));
        System.out.println("Enter the index of the first element: ");
        int index1=s.nextInt();
        System.out.println("Enter the index of the second number: ");
        int index2=s.nextInt();
        int arr2 = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = arr2;

        System.out.println("The array with swapped elements is: " + Arrays.toString(arr));


    }
}
