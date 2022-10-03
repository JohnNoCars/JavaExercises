package ImprovisedExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MINandMAXUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        
        int j =0;
        int [] arr = new int[5];
        
        while (true){
            System.out.println("Enter next number: ");
            arr[j] = s.nextInt();
            j++;
            
            if(j== arr.length){
                System.out.println("To continue, enter 'continue', or the process will terminate: ");
                input = s.next();
                if(input.equalsIgnoreCase("continue")){
                    int[] arr1 = new int[arr.length*2];
                    for (int i = 0; i<arr.length; i++) {
                        arr1[i]=arr[i];
                    }
                    arr=arr1;
                } else {
                    break;
                }
            }
        }
        System.out.println("Your current array is: " + Arrays.toString(arr));
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        for(int i =0; i<arr.length; i++){
            if (arr[i]<smallest){
                smallest=arr[i];
            } else if (arr[i]>largest) {
                largest=arr[i];
                
            }
        }
        System.out.println("The minimum value in the array is "+smallest+", and the maximum is "+largest+".");
        
    }
}
