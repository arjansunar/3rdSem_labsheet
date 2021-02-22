package Lab_sheet_3;

import java.util.Scanner;

public class Q3_getAvg {
  double getAverage(double num1,double num2, double num3){
    return (num1+num2+num3)/3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Q3_getAvg averageNumber=new Q3_getAvg();
    System.out.println("Enter three numbers: ");
    int num1= sc.nextInt(), num2= sc.nextInt(),num3= sc.nextInt();
    System.out.println("The average is " + averageNumber.getAverage(num1,num2,num3));
  }
}
