package Lab_sheet_5;

import java.util.Scanner;

public class Q5_replacePI {
  static String replacePI(String text){
    if (!text.contains("pi")) return text;
    int index =text.indexOf("pi");
    return text.substring(0,index)+"3.14"+ replacePI(text.substring(index+2));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a text: ");
    System.out.println("The new text is: "+ replacePI(sc.nextLine().toLowerCase()));
  }
}
