package ITBootcampExercises;

public class E20_PrintAllCharactersExceptC {
    public static void main(String[] args) {
        String input = "ITBootCamp";
        for (int i =0; i<input.length(); i++){
            if (input.charAt(i) == 'C') {
                continue;
            }
            System.out.print(input.charAt(i));
        }
    }
}
