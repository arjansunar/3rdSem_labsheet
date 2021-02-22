package Lab_sheet;

import java.util.Scanner;

public class Q23_isLastNumbersSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if ((num1%1000)==(num2%1000))
            System.out.println("They are same");
        else
            System.out.println("They are different");
    }
}
