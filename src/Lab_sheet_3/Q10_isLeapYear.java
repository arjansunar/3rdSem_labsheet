package Lab_sheet_3;

import java.util.Scanner;

public class Q10_isLeapYear {
  static boolean isLeapYear(int year){
    return year % 400 != 0 &&
            (year % 100 != 0) && (year % 4 == 0);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = sc.nextInt();
    System.out.println("Is leap year: "+ isLeapYear(year));
  }
}
