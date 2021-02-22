package Lab_sheet_4;

import java.util.Arrays;

public class Q8_getMaxAndMin {
  public static void getMaxAndMin(int []array) {
    int[] arr = array.clone();
    int max = arr[0], min = arr[0];
    for (int j : arr) {
      if (j > max) {
        max = j;
      } else if (min > j) {
        min = j;
      }
    }
    System.out.println("The maximum and minimum values are: "+ max+" and "+ min+" respectively.");
  }
  public static void main(String[] args) {
    int[] arr= {1,2,14,5,4,8,4,5,8,3,1,8,10};
    System.out.println("Initial array"+ Arrays.toString(arr));
    getMaxAndMin(arr);
  }
  }
