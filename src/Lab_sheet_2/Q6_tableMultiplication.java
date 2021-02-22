package Lab_sheet_2;

import java.util.Scanner;

public class Q6_tableMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(Table to be calculated): ");
        int number= sc.nextInt();
        for (int i = 0 ; i < 11; i ++){
            System.out.println(number +" x "+ i+" = " + (number*i));
        }
    }
}
