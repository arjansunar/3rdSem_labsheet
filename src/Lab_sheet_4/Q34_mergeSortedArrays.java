package Lab_sheet_4;

public class Q34_mergeSortedArrays {
  public static void mergeArr(int [] arrFirst,int[] arrSecond){
    int[] mergedArr= new int[arrFirst.length+ arrSecond.length];
    //merging Array
    for (int i = 0; i <mergedArr.length ; i++) {
      if (i< arrFirst.length) mergedArr[i]=arrFirst[i];
      else mergedArr[i]= arrSecond[i% arrSecond.length];
    }
    //Sorting merged Array
    for (int i = 0; i < mergedArr.length; i++) {
      for (int j = i; j < mergedArr.length; j++) {
        int temp;
        if(mergedArr[i]> mergedArr[j]){
          temp=mergedArr[i];
          mergedArr[i]=mergedArr[j];
          mergedArr[j]=temp;
        }
      }
    }
    //Assigning to the input arrays
    for (int i = 0; i <mergedArr.length ; i++) {
      if (i< arrFirst.length) arrFirst[i]=mergedArr[i];
      else  arrSecond[i% arrSecond.length]=mergedArr[i];
    }
  }
  public static void printArrVals(int [] arr){
    System.out.print(" Array: [ ");
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+((i< arr.length-1)? ", ":" "));
    }
    System.out.print("]");
  }
  public static void main(String[] args) {
    int[] firstArr = { 1, 5, 6, 7, 8, 10 }, secondArr= { 2, 4, 9 };
    System.out.println("First array:");
    printArrVals(firstArr);
    System.out.println("\nSecond array:");
    printArrVals(secondArr);
    mergeArr(firstArr,secondArr);
    System.out.println("\nAfter merging and reassignment:");
    System.out.println("First array:");
    printArrVals(firstArr);
    System.out.println("\nSecond array:");
    printArrVals(secondArr);
  }
}
