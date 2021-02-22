package Lab_sheet_4;

import java.util.Arrays;

public class Q10_getReverse {
  static void  getReverse(int []arr){
    int[] arrClone = arr.clone();
    for (int i = 0; i < arr.length; i++) {
      arr[i]=arrClone[arrClone.length-1-i];
    }
  }

  public static void main(String[] args) {
    int[] arr= {1,2,14,5,4,1,8,10};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    getReverse(arr);
    System.out.println("The reverse is: "+ Arrays.toString(arr));
  }
}
