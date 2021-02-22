package Lab_sheet_4;

import java.util.Arrays;

public class Q6_copyArray {
  static int [] getClone(int []arr){
    int[] clone = new int[arr.length];
    for (int i=0;i< arr.length;i++) {
      clone[i]=arr[i];
    }
    return clone;
  }

  public static void main(String[] args) {
    int [] arr= {1,5,8,9,7};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("The copy is: "+Arrays.toString(getClone(arr)));
  }
}
