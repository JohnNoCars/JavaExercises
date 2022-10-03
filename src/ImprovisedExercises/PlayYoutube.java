package ImprovisedExercises;

import java.util.Scanner;

public class PlayYoutube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int volume = 75;
        String input = "";
        System.out.println("Please adjust the volume: ");

        while (!input.equalsIgnoreCase("play")){
            input = s.next();
            if (input.equalsIgnoreCase("up")){
                volume = volume+10;
                if(volume>100){
                    volume=100;
                }

            } else if (input.equalsIgnoreCase("down")) {
                volume = volume -10;
                if (volume<0){
                    volume=0;
                }

            } else if (input.equalsIgnoreCase("mute")){
                volume = 0;
            }
            System.out.println("The volume is: " + volume + ". ");
        }
        System.out.println("The volume is " + volume + ". ");
    }
}
