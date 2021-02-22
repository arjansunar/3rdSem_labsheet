package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_insertToArray {
  static void insertElement(int[]arr,int index,int value){
    //shifting the array
    for (int i=arr.length-1;i>index;i--) {
      arr[i]=arr[i-1];
    }
    arr[index]=value;
    System.out.println("The array is: "+ Arrays.toString(arr));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr={1,2,5,7,4,8};
    System.out.println("Initial array: "+ Arrays.toString(arr));
    System.out.println("Enter an index:");
    int index= sc.nextInt();
    System.out.println("Enter the value:");
    int value= sc.nextInt();
    insertElement(arr,index,value);
  }
}
