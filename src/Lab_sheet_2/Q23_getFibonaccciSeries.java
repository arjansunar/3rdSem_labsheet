package Lab_sheet_2;

import java.util.Scanner;

public class Q23_getFibonaccciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers");
        int numberOfTerms = sc.nextInt();
        int fibonacciSeries =1;
        int tempA=0,tempB=0;
        for (int i = 0; i < numberOfTerms; i ++){
            System.out.print(fibonacciSeries+" ");
            tempA=fibonacciSeries;
            fibonacciSeries+= tempB;
            tempB= tempA;
        }
    }
}
