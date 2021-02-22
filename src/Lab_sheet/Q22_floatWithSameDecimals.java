package Lab_sheet;

import java.util.Scanner;

public class Q22_floatWithSameDecimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating point numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        if ((int)(num1*1000)==(int)(num2*1000)){
            System.out.println("They are the same.");
        }else{
            System.out.println("They are different.");
        }
    }
}
