package Lab_sheet_2;

import java.util.Scanner;

public class Q15_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = sc.nextInt();
        int factorial=1;
        for (int i = 1 ;i <=number ;i++){
            factorial*=i;
        }
        System.out.println("the factorial is "+factorial);
    }
}
