package Lab_sheet_4;

import java.util.Arrays;

public class Q28_getSmallestAndSecondSmallest {
  public static int [] getSmallestAnsSecondSmallest(int[] arr){
    int [] twoSmallest= new int[2];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int temp;
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    twoSmallest[0]=arr[0];
    twoSmallest[1]=arr[1];
    return twoSmallest;
  }

  public static void main(String[] args) {
    int[] arr={1,5,2,0,3,4,6,8,7};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("The two smallest numbers are: "+ Arrays.toString(getSmallestAnsSecondSmallest(arr)));
  }
}
