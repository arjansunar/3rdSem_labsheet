package Lab_sheet_3;

import java.util.Scanner;

public class Q20_isSubString {
  static boolean isSubstring(String str1,String str2){
    return str1.contains(str2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two string: ");
    String str1=sc.next(),str2=sc.next();
    System.out.println("Is Substring: " + isSubstring(str1,str2));
  }
}
