package Lab_sheet_3;

import java.util.Scanner;

public class Q18_reverseString {
  static String reverse(String text){
    StringBuilder reverse= new StringBuilder();
    for (int i = text.length()-1;i>=0;i--){
      reverse.append(text.charAt(i));
    }
    return reverse.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string:");
    String text = sc.next();
    System.out.println("Reverse: "+ reverse(text));
  }
}
