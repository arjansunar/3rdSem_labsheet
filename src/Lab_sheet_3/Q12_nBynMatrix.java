package Lab_sheet_3;

import java.util.Scanner;

public class Q12_nBynMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the order of the matrix:");
    int order = sc.nextInt();
    System.out.println("The matrix is: ");
    binaryMatrixMaker(order);
  }
  static void binaryMatrixMaker(int order){
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        System.out.print((int)(Math.random()*order)%2);
      }
      System.out.println();
    }
  }
}
