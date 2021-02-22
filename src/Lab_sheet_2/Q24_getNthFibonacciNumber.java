package Lab_sheet_2;

import java.util.Scanner;

public class Q24_getNthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci number ");
        int numberOfTerms = sc.nextInt();
        int fibonacciNumber =1;
        int tempA=0,tempB=0;
        for (int i = 1; i < numberOfTerms; i ++){
            tempA=fibonacciNumber;
            fibonacciNumber+= tempB;
            tempB= tempA;
        }
        System.out.println("The fibonacci number at "+ numberOfTerms +" is "+ fibonacciNumber);
    }
}
