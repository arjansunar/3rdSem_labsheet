package Lab_sheet_2;

import java.util.Scanner;

public class Q16_isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        boolean isPrime=true;
        for (int i =2 ; i < number;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println((isPrime)?"Its a prime number ": "Its not a prime number ");
    }
}
