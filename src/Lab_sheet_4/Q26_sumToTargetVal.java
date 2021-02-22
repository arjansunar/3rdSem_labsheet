package Lab_sheet_4;

import java.util.HashMap;

public class Q26_sumToTargetVal {
  public static HashMap<Integer,Integer> getPairsEqualToTarget(int []arr,int target){
    HashMap <Integer,Integer> pairs= new HashMap<>();
    for (int i = 0; i < arr.length ; i++) {
      for (int j = i; j < arr.length; j++) {
        int sum = arr[i]+arr[j];
        if (sum ==target){
          pairs.put(arr[i],arr[j] );
          return pairs;
        }
      }
    }
    return pairs;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,4,5,6};
    int target =6;
    System.out.println("For array: {1,2,4,5,6} \nand target: 6\n The pairs that equal to the target are:");
    System.out.println(getPairsEqualToTarget(arr,target));
  }
}
