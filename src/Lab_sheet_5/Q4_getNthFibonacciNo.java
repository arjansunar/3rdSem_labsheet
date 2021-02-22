package Lab_sheet_5;

import java.util.Scanner;

public class Q4_getNthFibonacciNo {
  static int getNthFibonacciNo(int num,int firstval,int secondVal){
    int sum =firstval+secondVal;
    if (num == 0) return 0;
    else if (num ==1) return 1;
    else if (num >2) return getNthFibonacciNo(--num,secondVal,sum);
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    System.out.println("The nth term in the fibonacci series is: "+ getNthFibonacciNo(sc.nextInt(),0,1));
  }
}
