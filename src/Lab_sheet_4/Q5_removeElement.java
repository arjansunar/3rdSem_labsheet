package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_removeElement {
  static void removeElement(int[]arr,int element){
    for (int i=0;i<arr.length;i++) {
      if (arr[i]==element ){
        arr[i]=arr[i+1];
      }
    }
    arr[arr.length-1]=0;
    System.out.println("The array is: "+ Arrays.toString(arr));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr={1,2,5,7};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("Enter a value:");
    int value= sc.nextInt();
    removeElement(arr,value);
  }
}
