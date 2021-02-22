package Lab_sheet_4;

import java.util.Arrays;

public class Q22_getAverageWithException {
  static double getAverage(int [] arr){
    int avg=0;
    //sending the largest to the end
    for (int i = 0; i < arr.length-1; i++) {
      if(arr[i]>arr[i+1]){
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }
    //sending the smallest to the first
    for (int i = arr.length-1; i>0; i--) {
      if(arr[i]<arr[i-1]){
        int temp = arr[i];
        arr[i]=arr[i-1];
        arr[i-1]=temp;
      }
    }
    //calculating average
    int length=0;
    for (int i=1; i<arr.length-1;i++) {
      if (arr[i]!=arr[0]&&arr[i]!=arr[arr.length-1]){
        avg+=arr[i];
        length++;
      };
    }

    return ((double)avg/length);
  }

  public static void main(String[] args) {
    int [] arr={5,4,6,7,7,1};
    System.out.println("Initial Array: "+Arrays.toString(arr));
    System.out.println("The average execept the smallest and largest: "+ getAverage(arr));
  }
}
