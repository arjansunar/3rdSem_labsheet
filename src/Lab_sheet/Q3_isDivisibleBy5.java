package Lab_sheet;

import java.util.Scanner;

public class Q3_isDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number%5==0)
            System.out.println(number+" is divisible by 5");
        else
            System.out.println(number+" is not divisible by 5");
//        System.out.println((number%5==0)? number+" is divisible by 5":number+" is not divisible by 5");
    }
}
