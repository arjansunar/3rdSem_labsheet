package Lab_sheet_3;

import java.util.Scanner;

public class Q6_getAllWords {
  static  int getTotalWords(String sentence){
    return sentence.split(" ").length;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    System.out.println("Input the string: ");
    String sentence = sc.nextLine();
    System.out.println("Number of words: "+ getTotalWords(sentence));
  }
}
