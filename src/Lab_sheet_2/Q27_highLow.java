package Lab_sheet_2;

import java.util.Scanner;

public class Q27_highLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomGoalVal = (int) (Math.random() * 100);
        for (int i = 1 ; ; i++){
            System.out.println("Guess "+i+": ");
            int input =sc.nextInt();
            if (input == randomGoalVal) {
                System.out.println("Correct after " +i+" guesses – brilliant!! ");
                break;
            }
            if (i ==10) {
                System.out.println("GAME OVER --better luck next time ");
                break;
            }
            System.out.println("\tHint: "+((input<randomGoalVal)? "higher":"lower"));
        }
    }
}
