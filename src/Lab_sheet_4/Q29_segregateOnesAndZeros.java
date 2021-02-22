package Lab_sheet_4;

import java.util.Arrays;

public class Q29_segregateOnesAndZeros {
  public static void segregateBinary(int [] arr){
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
  }

  public static void main(String[] args) {
    int [] arr = {1,0,0,1,0,1,1,1,0,1};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    segregateBinary(arr);
    System.out.println("Segregatted array: "+ Arrays.toString(arr));
  }
}
