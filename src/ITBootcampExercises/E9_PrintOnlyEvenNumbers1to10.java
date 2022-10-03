package ITBootcampExercises;

public class E9_PrintOnlyEvenNumbers1to10 {
    public static void main(String[] args) {
        int number = 0;
        while(number<10){
            number++;
            if (number%2==0) {
                System.out.println(number);
            }
        }
    }
}
