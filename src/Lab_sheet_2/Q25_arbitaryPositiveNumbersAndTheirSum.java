package Lab_sheet_2;

import java.util.Scanner;

public class Q25_arbitaryPositiveNumbersAndTheirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int sum = 0;
        while(true){
          int number = sc.nextInt();
          if (number<0) break;
          sum+= number;
            System.out.println("Sum is "+ sum);
        }
        System.out.println("The program has terminated due to a negative input.");
    }
}
