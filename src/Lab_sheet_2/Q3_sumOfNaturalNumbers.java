package Lab_sheet_2;

import java.util.Scanner;

public class Q3_sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int numberN = sc.nextInt(),sum =0;
        System.out.println("The natural numbers: ");
        for (int i = 1 ; i <= numberN; i ++){
            sum +=i;
            System.out.println("\t"+i);
        }
        System.out.println("The sum of these numbers is: "+ sum);

    }
}
