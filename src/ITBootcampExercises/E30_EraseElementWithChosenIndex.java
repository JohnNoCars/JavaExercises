package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E30_EraseElementWithChosenIndex {
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
        System.out.println("Choose the index of the element you'd like to remove from the array: ");
        int index = s.nextInt();
        int [] arr1 = new int [arr.length-1];

        for(int i = 0, k=0; i< arr.length;i++){
            if (i==index){
                continue;
            }
            arr1[k++]=arr[i];
        }
        System.out.println("The array without the element is: " + Arrays.toString(arr1));


    }
}
