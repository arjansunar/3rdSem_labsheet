package Lab_sheet_5;

import java.util.Scanner;

public class Q1_noOfBunnyEars {

  static int getNoOFEars(int noOFBunnies){
    if(noOFBunnies==0){
      return 0;
    }
    return 2+ getNoOFEars(noOFBunnies-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of bunnies: ");
    System.out.println("The number of ears are: "+ getNoOFEars(sc.nextInt()));
  }
}
