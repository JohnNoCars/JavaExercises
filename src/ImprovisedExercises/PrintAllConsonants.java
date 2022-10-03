package ImprovisedExercises;

import java.util.Arrays;

public class PrintAllConsonants {
    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'v', 'e', 'z', 'a', 'i', 'o', 'y', 'u', 'z', 'u', 'e'};
        char[] arr1 = new char[arr.length];
        int consonants = 0;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]== 'a' || arr[i]== 'e' || arr[i]== 'i' || arr[i]== 'o' || arr[i]== 'u' || arr[i]== 'y') {
                arr1[consonants] = arr[i];
                consonants++;

            }

        }
        char[] arr2 = new char[consonants];

        for (int i = 0; i<consonants; i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
