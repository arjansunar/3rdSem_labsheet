package Lab_sheet_4;

import java.util.Arrays;

public class Q9_differenceBetweenMinAndMax {
  public static int getDifference(int []array){
    int[]arr=array.clone();
    if(arr.length<2){
      return 0;
    }
    int max=arr[0],min=arr[0];
    for (int j : arr) {
      if (j > max) {
        max = j;
      } else if (min > j) {
        min = j;
      }
    }
    return max-min;
  }

  public static void main(String[] args) {
    int[] arr= {1,2,14,5,4,8,4,5,8,3,1,8,10};
    System.out.println("Initial array"+ Arrays.toString(arr));
    System.out.println("The difference between min and max is: "+ getDifference(arr));
  }
}
