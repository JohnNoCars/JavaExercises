package ITBootcampExercises;

import java.util.Arrays;
import java.util.Scanner;

public class E26_ArrayNamesThatStartWithOneLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        int j = 0;

        String[] arr = new String[5];

        while(true){
            System.out.println("Enter a name: ");
            arr[j] = s.nextLine();
            j++;

            if(j==arr.length){
                System.out.println("Enter 'continue' to input more names into the array or 'done' to terminate the program: ");
                input = s.nextLine();
                if(input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    String [] arr1 = new String[arr.length*2];
                    for (int i = 0; i <arr.length; i++){
                        arr1[i]=arr[i];

                    }
                    arr=arr1;

                }

            }

        }
        System.out.println("The current array of names is: " + Arrays.toString(arr));
        System.out.println("Type in the initial letter of the names you'd like to retrieve from your array: ");

        String initial = s.next();
        String [] names = new String[arr.length];
        int k = 0;
        for (int i = 0; i< arr.length;i++){
            if (initial.charAt(0) == arr[i].charAt(0)){
                names[k]=arr[i];
                k++;

            }
        }
        String[] names1 = new String[k];
        for(int i = 0; i<k; i++){
            names1[i]=names[i];
        }
        System.out.println("The array of names that start with " + initial + " is: " + Arrays.toString(names1));


    }
}
