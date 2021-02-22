package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_getInputAndPrintArray {
  public static void printArray(Scanner sc,int n){
    int[] arr = new int[n];
    System.out.println("Input the values for the array of size "+n);
    for (int i =0; i< n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("The array is: "+ Arrays.toString(arr));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    printArray(sc,n);
  }
}
