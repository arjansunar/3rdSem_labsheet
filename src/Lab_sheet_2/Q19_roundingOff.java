package Lab_sheet_2;

import java.util.Scanner;

public class Q19_roundingOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point number ");
        double number = sc.nextFloat();
        System.out.println("Enter the precision you want");
        int precision = sc.nextInt();
        double required_number= Math.round(number*Math.pow(10,precision))/Math.pow(10,precision);
        System.out.println("The rounded value is: "+ required_number );


    }
}
