package Lab_sheet_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q12_getCommonValues {
  static Object[] getCommonValues(int []arr1,int[] arr2){
    ArrayList<Integer> commonValues=new ArrayList<>();
    for (int i :arr1) {
      for (int j :arr2) {
        if (i ==j) commonValues.add(i);
      }
    }
    return commonValues.toArray();
  }

  public static void main(String[] args) {
    int [] arr1={5,8,6,2,1},arr2={1,4,8,6};
    System.out.println("The arrays are: \n"+ Arrays.toString(arr1)+"\n"+Arrays.toString(arr2)+
            "\nThe common values are: "+ Arrays.toString(getCommonValues(arr1, arr2)));
  }
}
