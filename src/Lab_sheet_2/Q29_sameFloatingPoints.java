package Lab_sheet_2;

import java.util.Scanner;

public class Q29_sameFloatingPoints {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two floating point numbers");
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    System.out.println("Enter the precision: ");
    int precision = sc.nextInt();
    if ((int)(num1*Math.pow(10,precision))==(int)(num2*Math.pow(10,precision))){
      System.out.println("They are the same.");
    }else{
      System.out.println("They are different.");
    }
  }
}
