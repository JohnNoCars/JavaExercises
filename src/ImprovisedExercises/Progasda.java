package ImprovisedExercises;

import java.util.Scanner;

public class Progasda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String n = s.nextLine();
        System.out.print("Enter word: ");
        String w = s.next();

        System.out.println("The word appears " + brojPonavljanja(w,n));
    }
    public static int brojPonavljanja(String s, String recenica) {
        recenica = recenica.toLowerCase(); //convert to lowercase string
        s = s.toLowerCase();//convert word to lowercase
        return (recenica.split(s).length); //the sentence is split into as many times as it finds the defined string 's'
    }
}
