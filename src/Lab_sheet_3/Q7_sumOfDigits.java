package Lab_sheet_3;

import java.util.Scanner;

public class Q7_sumOfDigits {
  static int getsumOfDigits(int number){
    int sum =0;
    while(number>0){
      int digits = number%10;
      number/=10;
      sum+=digits;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input an integer: " );
    int number = sc.nextInt();
    System.out.println("The sum is: "+ getsumOfDigits(number));
  }
}
