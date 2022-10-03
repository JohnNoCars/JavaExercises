package ImprovisedExercises;

import java.util.Scanner;

public class DaLiJeOsobaPunoletnaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = 1;
        for (int i = 0; i < godinaRodjenja; i++) {
            godinaRodjenja = s.nextInt();
            s.nextLine();
            System.out.println("Unesite trenutnu godinu: ");
            int trenutnaGodina = s.nextInt();
            if (trenutnaGodina - godinaRodjenja >= 18) {
                System.out.println("Vi ste punoletna osoba.");
                System.out.println("Ukoliko zelite da prekinete program, unesite 'kraj', za nastavak unesite bilo sta.");
                String unos = s.nextLine();
                if (unos.equalsIgnoreCase("kraj")) {
                    System.out.println("Dovidjenja.");
                    break;
                } else if (!unos.equalsIgnoreCase("kraj")){
                    continue;
                }
            } else {
                System.out.println("Vi niste punoletni.");
            }


        }
    }
}
