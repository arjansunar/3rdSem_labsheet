package Lab_sheet_3;

import java.util.Scanner;

public class Q13_getAreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 1-side");
    int side1=sc.nextInt();
    System.out.println("Input 2-side");
    int side2=sc.nextInt();
    System.out.println("Input 3-side");
    int side3=sc.nextInt();
    System.out.println("Area of the triangle is: "+ getArea(side1,side2,side3));
  }
  static double getArea(int side1,int side2,int side3){
    double semiPerimeter=getSemiPerimeter(side1,side2,side3);
    return Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
  }
  static double getSemiPerimeter(int side1,int side2,int side3){
    return ((double)side1+side2+side3)/2;
  }
}
