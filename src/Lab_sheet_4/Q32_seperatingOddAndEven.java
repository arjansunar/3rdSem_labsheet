package Lab_sheet_4;

import java.util.Arrays;

public class Q32_seperatingOddAndEven {
  static void seperateEvenAndOdd(int [] arr){
    int[] clone= arr.clone();
    int index=0;
    int lastIndex= arr.length-1;
    for (int j : clone) {
      if (j % 2 == 0) arr[index++] = j;
      else  arr[lastIndex--] = j;
    }
  }

  public static void main(String[] args) {
    int [] arr={7,1,2,3,4,5,6};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    seperateEvenAndOdd(arr);
    System.out.println("Separating odd and even terms: "+Arrays.toString(arr));
  }
}
