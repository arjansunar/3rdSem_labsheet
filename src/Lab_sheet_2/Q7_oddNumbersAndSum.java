package Lab_sheet_2;

import java.util.Scanner;

public class Q7_oddNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms(n): ");
        int numberN = sc.nextInt();
        System.out.println("The odd numbers are: ");
        int sum=0;
        for (int i = 1 ; i < numberN *2; i+=2){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The sum of odd numbers up to "+numberN + " terms is: "+sum);
    }
}
