package ImprovisedExercises;

import java.util.Scanner;

public class VezbanjeSaNedom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = " ";
        int broj;
        int suma = 0;

        do {
            System.out.println("Unesite sledeci broj: ");
            broj = s.nextInt();

            suma = suma +broj;

            System.out.println("Unesite bilo sta za nastavak ili 'kraj' da prekinete program: ");
            input = s.next();

            if (input.equalsIgnoreCase("kraj")){
                System.out.println("Dovidjenja.");
                break;
            } System.out.println(suma);
        } while(!input.equalsIgnoreCase("kraj"));


    }
}
