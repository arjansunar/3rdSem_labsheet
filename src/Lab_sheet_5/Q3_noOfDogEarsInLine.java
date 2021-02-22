package Lab_sheet_5;

import java.util.Scanner;

public class Q3_noOfDogEarsInLine {
  static int getNoOfDogEarsInLine(int noOFDogs){
   if (noOFDogs==0)return 0;
   if (noOFDogs%2==0)return 3+getNoOfDogEarsInLine(noOFDogs-1);
   return 2+getNoOfDogEarsInLine(noOFDogs-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of dogs: ");
    System.out.println("The number of ears in the dogs line: "+ getNoOfDogEarsInLine(sc.nextInt()));
  }
}
