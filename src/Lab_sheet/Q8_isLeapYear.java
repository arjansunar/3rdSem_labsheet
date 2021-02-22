package Lab_sheet;

import java.util.Scanner;

public class Q8_isLeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        String result;
        if (year % 400 ==0 ){
            result =" is a leap year";
        }else if (year % 100==0){
            result =" is not a leap year";
        }else if (year % 4==0){
            result =" is a leap year";
        }else {
            result =" is not a leap year";
        }
        System.out.println(year + result);
    }
}
