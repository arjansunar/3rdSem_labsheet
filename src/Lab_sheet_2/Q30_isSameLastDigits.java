package Lab_sheet_2;

import java.util.Scanner;

public class Q30_isSameLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer");
        int number1 = sc.nextInt();
        System.out.println("Input next integer");
        int number2 = sc.nextInt();
        System.out.println("value of n:");
        int nVal = sc.nextInt();
        if (number1% (int)(Math.pow(10,nVal))==number2% (int)(Math.pow(10,nVal))){
            System.out.println("They are same.");
        }else {
            System.out.println("They are different.");
        }

    }
}
