package FelixWilking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 100;
        System.out.println("Is your secret number"+(max+min)/2+"?");
        String answer = input.nextLine();
        while(!(answer.equals("="))) {
            if (answer.equals("+")) {
                min = (max + min) / 2;
                System.out.println("Is your secret number" + (max + min) / 2 + "?");
            } else if (answer.equals("-")) {
                max = (max + min) / 2;
                System.out.println("Is your secret number" + (max + min) / 2 + "?");
            }
            answer = input.nextLine();
        }
    }
}
