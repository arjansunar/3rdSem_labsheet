package Lab_sheet_5;

import java.util.Scanner;

public class Q2_getNumberOFEs {
  static int getNumberOFEs(String text){
    if (!text.contains("E")) return 0;
    int indexOfE = text.indexOf("E");
    return 1 + getNumberOFEs(text.substring(indexOfE+1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the text: ");
    System.out.println("The number of E's are: "+ getNumberOFEs(sc.nextLine().toUpperCase()));
  }
}
