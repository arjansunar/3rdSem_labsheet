package Lab_sheet_2;

import java.util.Scanner;

public class Q14_countingNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        long number = sc.nextLong();
        long tenBillion = 10000000000L;
        int count=0;
        while (number>0){
            if(number>tenBillion){
                System.out.println("Number too large");
                break;
            }
            number/=10;
            count++;
        }
        System.out.println("The number of digits is "+count);
    }
}
