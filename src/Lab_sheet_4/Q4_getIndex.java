package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_getIndex {
  static int getIndex(int [] arr,int value){
    for (int i=0;i<arr.length;i++) {
      if (arr[i]==value ){
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr={1,2,5,7};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("Enter a value:");
    int value= sc.nextInt();
    System.out.println("Index of "+value+" is: " +getIndex(arr,value));
  }
}
