package Lab_sheet;

import java.util.Scanner;

public class Q12_isDigitOrLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = sc.next().charAt(0);
        if ((input >= 'A'&& input <='Z') || (input >= 'a'&& input <='z')){
            System.out.println("Its a letter");
        }else if ((input >= '0'&& input <='9')){
            System.out.println("Its a number");
        }else{
            System.out.println("Please enter either number or letter");
        }
    }
}
