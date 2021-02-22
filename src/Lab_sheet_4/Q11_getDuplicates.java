package Lab_sheet_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11_getDuplicates {
  public static Object[] getDuplicates(int []arr){
    ArrayList<Integer> duplicateVals= new ArrayList<>();
    for (int i = 0; i <arr.length ; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if(arr[i]==arr[j]){
          duplicateVals.add(arr[i]);
          break;
        }
      }
    }
    ArrayList<Integer> filteredDuplicates= new ArrayList<>();
    for (int i: duplicateVals){
      if (!filteredDuplicates.contains(i)){
        filteredDuplicates.add(i);
      }
    }
    return filteredDuplicates.toArray();
  }

  public static void main(String[] args) {
    int [] arr = {20, 20, 30, 40, 50, 50, 50,1,1,1,1,1};
    System.out.println("Array: "+Arrays.toString(arr)+"\nDuplicates: "+ Arrays.toString(getDuplicates(arr)));
  }
}
