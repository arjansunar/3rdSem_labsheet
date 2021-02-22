package Lab_sheet_2;

import java.util.Scanner;

public class Q5_cubingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Number is: "+ i +" and cube of "+ i + " is "+(int)(Math.pow(i,3)));
        }
    }
}
