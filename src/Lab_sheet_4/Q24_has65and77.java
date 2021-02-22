package Lab_sheet_4;

import java.util.Arrays;

public class Q24_has65and77 {
  static boolean has65and77(int [] arr){
    boolean hasBoth65and77=false;
    for (int i : arr) {
      hasBoth65and77 = i == 65;
    }
    for (int i : arr) {
      hasBoth65and77 = i == 77;
    }
    return hasBoth65and77;
  }

  public static void main(String[] args) {
    int [] arr= {40,89,65,77};
    System.out.println("Intitial array: "+ Arrays.toString(arr));
    System.out.println("Does the array have both 65 and 77 ?: "+ has65and77(arr));
  }
  }
