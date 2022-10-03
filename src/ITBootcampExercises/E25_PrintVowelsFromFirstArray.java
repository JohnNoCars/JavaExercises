package ITBootcampExercises;

import java.util.Arrays;

public class E25_PrintVowelsFromFirstArray {
    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'v', 'g', 'd', 'i', 'e'};
        char[] arr1 = new char[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'y') {
                arr1[j]=arr[i];
                j++;
            }
        }
        char[] arr2 = new char[j];
        for (int i = 0; i<arr2.length; i++){
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));

    }
}
