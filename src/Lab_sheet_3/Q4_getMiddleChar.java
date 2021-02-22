package Lab_sheet_3;

import java.util.Scanner;

public class Q4_getMiddleChar {
  static String getMiddleCharacter(String alphanumericChar){
    int length = alphanumericChar.length();
    if (length%2==0){
      System.out.println(length/2);
      return alphanumericChar.substring(length/2-1,length/2+1);
    }

    return alphanumericChar.substring(length/2,length/2+1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a string:");
    String input = sc.next();
    System.out.println("The middle character is "+ getMiddleCharacter(input));
  }
}
