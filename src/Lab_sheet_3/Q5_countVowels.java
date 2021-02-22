package Lab_sheet_3;

import java.util.Scanner;

public class Q5_countVowels {
  static int totalVowels(String word){
    int total=0;
    for(String i : word.split("")){
      if (i.equalsIgnoreCase("a")||
              i.equalsIgnoreCase("e")||
              i.equalsIgnoreCase("i")||
              i.equalsIgnoreCase("o")||
              i.equalsIgnoreCase("u")){
        total++;
      }
    }
    return total;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a string :");
    String word = sc.next();
    System.out.println("Total vowels: " + totalVowels(word));
  }
}
