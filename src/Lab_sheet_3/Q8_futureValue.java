package Lab_sheet_3;

import java.util.Scanner;

public class Q8_futureValue {
  static void getFutureValue(int principleAmount,int time,double rate,int frequency){
    System.out.println("Years\tFutureValue");
    for (int i = 1; i <= time; i++) {
      double mulFactor=(Math.pow(((frequency+rate/100)/frequency),frequency*i));
      double futureVal=principleAmount*mulFactor;
      System.out.println(i+"\t\t" + futureVal);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the investment amount: ");
    int principle = sc.nextInt();
    System.out.println("Input the rate: ");
    double rate= sc.nextDouble();
    System.out.println("Input number of years: ");
    int time = sc.nextInt();
    getFutureValue(principle,time,rate,12);
  }
}
