package Lab_sheet_4;

import java.util.Scanner;

public class Q2_getSumArray {
  public static int getSum(int[] arr){
    int sum=0;
    for (int i:arr) {
      sum+=i;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size= sc.nextInt();
    System.out.println("Enter the values:");
    int[] arr = new int[size];
    for (int i =0; i< size;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("The sum of the array values is: "+getSum(arr)+"\nAnd the average is: "+((double)getSum(arr)/size));
  }
}
