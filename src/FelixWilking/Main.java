package FelixWilking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = 50;
        int guess2 = 100;
        System.out.println("Is your secret number"+guess+"?");
        String answer = input.nextLine();
        for(int i = 0;!(answer.equals("="));i++){
            if(i%2 == 0) {
                if (answer.equals("+")) {
                    guess2 = (guess - guess2)/2 + guess2;
                } else if (answer.equals("-")) {
                    guess2 = (guess - guess2)/2 - guess2;
                }
            }
            else{

            }
            System.out.println("Is your secret number"+guess+"?");
            answer = input.nextLine();
        }
    }
}
