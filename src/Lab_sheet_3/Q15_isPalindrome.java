package Lab_sheet_3;

import java.util.Scanner;

public class Q15_isPalindrome {
  static boolean isPalindrome(int number) {
    int tempNum = number;
    int newNum = 0;
    int len=String.valueOf(number).length();
    for(int i =len-1;i>= 0;i--){
      newNum += number % 10 * Math.pow(10,i);
      number /= 10;
    }
    return tempNum==newNum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    System.out.println("Is palindrome: "+ isPalindrome(number));
  }
}
