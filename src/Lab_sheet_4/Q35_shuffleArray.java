package Lab_sheet_4;

public class Q35_shuffleArray {
  public static void shuffleArray(int []array){
    for (int i = array.length - 1; i > 0; i--) {
      int j = (int)Math.floor(Math.random() * (i + 1));
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
  public static void printArrayVals(int[]arr ){
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+((i< arr.length-1)? ", ":" "));
    }
    System.out.print("]");
  }
  public static void main(String[] args) {
    int [] arr= { 1, 2, 3, 4, 5, 6 };
    System.out.print("Initial Array: [ ");
    printArrayVals(arr);
    shuffleArray(arr);
    System.out.print("\nShuffled Array: [ ");
    printArrayVals(arr);
  }
  }

