package Lab_sheet_4;

import java.util.Arrays;

public class Q13_getSecondLargestElement {
  static int getSecondLargestElement(int []arr){
    for (int i = 0; i < 2; i++) {
      for (int j = i; j < arr.length; j++) {
        if(arr[i]<arr[j]){
          int temp  = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    return arr[1];
  }

  public static void main(String[] args) {
    int[] arr= {1,2,3,4,5};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("The second largest value is: "+ getSecondLargestElement(arr));
  }
}
