package Lab_sheet_4;

import java.util.Arrays;

public class Q20_equalityTest {
  static boolean testEquality(int[] arr1,int[] arr2){
    boolean isEqual =true;
    if(arr1.length!= arr2.length)
      return false;
    for (int i : arr1) {
      for (int j: arr2) {
        if(i!=j){
          isEqual=false;
          break;
        }
      }
    }
    return isEqual;
  }

  public static void main(String[] args) {
    int [] arr1={1,2,3,4,5};
    int [] arr2={1,2,3,4,6};
    System.out.println("1st array: "+ Arrays.toString(arr1)+"\n2nd array: "+Arrays.toString(arr2));
    System.out.println("Equality: "+ testEquality(arr1,arr2));
  }
}
