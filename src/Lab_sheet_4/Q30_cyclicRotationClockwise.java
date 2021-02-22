package Lab_sheet_4;

import java.util.Arrays;

public class Q30_cyclicRotationClockwise {
  static void rotateClockwise(int []arr){
    int tempLastVal= arr[arr.length-1];
    for (int i=arr.length-1;i>0;i--) {
      arr[i]=arr[i-1];
    }
    arr[0]=tempLastVal;
  }

  public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    rotateClockwise(arr);
    System.out.println("Rotating clockwise: "+ Arrays.toString(arr));
  }
}
