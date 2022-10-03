package ITBootcampExercises;

public class E16_ForLoopSumOfOddNumbersContinue {
    public static void main(String[] args) {
        int oddSum = 0;
        for (int i = 0; i<10; i++){
            if (i%2==0){
                continue;
            }
            oddSum = oddSum + i;

        }System.out.println(oddSum);
    }
}
