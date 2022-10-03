package ITBootcampExercises;

import java.util.Scanner;

public class E19_PrintVowelsFromString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input;

        for (int i = 1; i!=0; i++){
            System.out.println("");
            System.out.println("Please enter the string you'd like to extract the vowels from: ");
            input = s.nextLine();
            for (int j = 0; j<input.length(); j++){
                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i' || input.charAt(j) == 'o'
                        || input.charAt(j) == 'u' || input.charAt(j) == 'y') {
                    System.out.print(input.charAt(j) + " ");
                }
            }
            if (input.equalsIgnoreCase("end")){
                System.out.println("Thank you for using the program. Goodbye.");
                break;
            }
        }
    }
}
