package Lab_sheet_4;

import java.util.Arrays;
import java.util.HashMap;

public class Q21_getNumberOfOddAndEven {
  static HashMap<String,Integer> getNumberOfOddAndEven(int [] arr){
    HashMap<String,Integer> numberOfOddAndEven = new HashMap<>();
    int numberOfOdd=0,numberOfEven=0;
    for (int i: arr) {
      if(i%2==0) numberOfEven++;
      else numberOfOdd++;
    }
    numberOfOddAndEven.put("Even",numberOfEven);
    numberOfOddAndEven.put("Odd",numberOfOdd);
    return numberOfOddAndEven;
  }

  public static void main(String[] args) {
    int [] arr={1,2,3,4,5};
    System.out.println("initial array: "+ Arrays.toString(arr));
    HashMap<String,Integer> numberOfOddAndEven = getNumberOfOddAndEven(arr);
    int numberOfEven= (int) numberOfOddAndEven.get("Even");
    int numberOfOdd= (int) numberOfOddAndEven.get("Odd");
    System.out.println("The number of even elements are: "+numberOfEven );
    System.out.println("The number of odd elements are: "+numberOfOdd);
  }
}
