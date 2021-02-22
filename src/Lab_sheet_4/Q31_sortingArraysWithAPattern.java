package Lab_sheet_4;

import java.util.Arrays;

public class Q31_sortingArraysWithAPattern {
  static void sortArray(int[] arr){
    int[] clone= arr.clone();
    //sorting the clone
    Arrays.sort(clone);
    //adding the required pattern: 1st element should be maximum, 2nd value should be minimum value,
    // 3rd should be second maximum, 4th second be second minimum ...
    int maxIndex= clone.length;
    int minIndex=0;
    for (int i=0;i< arr.length;i++) {
      if (i%2==0){
        arr[i]=clone[--maxIndex];
      }else {
       arr[i]= clone[minIndex++];
      }
    }
  }

  public static void main(String[] args) {
    int [] arr={5,2,3,4,1,6};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    sortArray(arr);
    System.out.println("Sorted array: "+ Arrays.toString(arr));
  }
}
