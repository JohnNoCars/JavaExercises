package ImprovisedExercises.debuggerDemo;

import java.util.Arrays;

public class NizNeki {
    public static void main(String[] args) {
        int[]niz = {1, 2, 3, 4, 5, 6, 7, 8};
        String recenica = "a e i o u";

        int duzinaNiza = niz.length;
        System.out.println(duzinaNiza);

        String[] samoglasnici = recenica.split("o");
        System.out.println(Arrays.toString(samoglasnici));
        int duzinaSamoglasnici = samoglasnici.length;

        System.out.println(duzinaSamoglasnici);

        System.out.println();

        String smrda = "Neda";

        System.out.println(smrda.charAt(1));

    }
}
