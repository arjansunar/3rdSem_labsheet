package Lab_sheet_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q23_hasZeroAndMinusOne {
  static boolean withoutZeroAndMinusOne(int [] arr){
    for (int i : arr) {
      if (i==0 || i==-1) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int [] arr= {-1,2,9,1,8,0,4,5};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("Is the array is without 0 or -1: "+ withoutZeroAndMinusOne(arr));
  }
}
