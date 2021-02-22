package Lab_sheet;

import java.util.Scanner;

public class Q14_sumOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int number = sc.nextInt();
        int sum = 0;
        sum += number%10;
        number/=10;
        sum += number%10;
        number/=10;
        sum += number%10;
        System.out.println("The sum of the given digit is: "+sum);
    }
}
