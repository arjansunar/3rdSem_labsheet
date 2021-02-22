package Lab_sheet;

import java.util.Scanner;

public class Q2_CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
//        System.out.println((number%2==0)? "Number is even": "Number is odd");
    }
}
