package Lab_sheet_3;

import java.util.Scanner;

public class Q19_repalceVowels {
  static String replaceVowels(String word) {
    StringBuilder replacedString = new StringBuilder();
    for (String i : word.split("")) {
      if (i.equalsIgnoreCase("a") ||
              i.equalsIgnoreCase("e") ||
              i.equalsIgnoreCase("i") ||
              i.equalsIgnoreCase("o") ||
              i.equalsIgnoreCase("u")) {
          replacedString.append((char)(i.charAt(0)+1));
      }else{
        replacedString.append(i.charAt(0));
      }
    }
    return replacedString.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string to replace: ");
    String word = sc.next();
    System.out.println("Replaced vowels: "+ replaceVowels(word));
  }
}
