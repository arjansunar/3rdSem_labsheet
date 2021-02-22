package Lab_sheet_4;

import java.util.Arrays;

public class Q33_sortingBinaryArrayInO_n {
  static void sortBinary(int []arr){
    int [] clone = arr.clone();
    int index=0;
    int lastIndex= arr.length-1;
    for (int j : clone) {
      if (j==0){
        arr[index++]= 0;
      }else{
        arr[lastIndex--]=1;
      }
    }
  }

  public static void main(String[] args) {
    int []arr= {1,0,0,1,1,0,1,0};
    System.out.println("Initial Array:\t "+ Arrays.toString(arr));
    sortBinary(arr);
    System.out.println("Result:\t\t\t "+ Arrays.toString(arr));
  }
}
