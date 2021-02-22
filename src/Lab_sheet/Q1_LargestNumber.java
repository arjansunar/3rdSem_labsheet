package Lab_sheet;

import java.util.Scanner;

public class Q1_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1>number2){
            System.out.println(number1+" is the largest number.");
        }else{
            System.out.println(number2+" is the largest number.");
        }
//        System.out.println((number1>number2) ? number1:number2+" is the largest number. " );

    }
}
