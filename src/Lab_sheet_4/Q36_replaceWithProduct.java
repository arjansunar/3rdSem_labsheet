package Lab_sheet_4;

public class Q36_replaceWithProduct {
  public static void replaceWithProduct(int [] arr){
    int [] finalArray=arr.clone();
    for (int i=0; i< arr.length;i++) {
      int product=1;
      for (int j = 0; j < arr.length; j++) {
        if (i==j) continue;
        product*=finalArray[j];
      }
      arr[i]=product;
    }
  }
  public static void printArrayVals(int[]arr ){
    System.out.print(" Array: [ ");
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+((i< arr.length-1)? ", ":" "));
    }
    System.out.print("]");
  }
  public static void main(String[] args) {
    int [] initialArray= {0, 1, 2, 3, 4, 5, 6, 7} ;
    printArrayVals(initialArray);
    System.out.println("\nArray with product of every other element: ");
    replaceWithProduct(initialArray);
    printArrayVals(initialArray);
  }
}
