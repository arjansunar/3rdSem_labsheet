package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_hasVal {
  public static boolean hasValue(int value,int []arr){
    boolean hasValue=false;
    for (int i:arr
         ) {
      if (value==i){
        hasValue=true;
        break;
      }
    }
    return hasValue;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr={1,2,5,7};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("Enter a value to check:");
    int value= sc.nextInt();
    System.out.println("Array has value: "+ hasValue(value,arr));
  }
}
