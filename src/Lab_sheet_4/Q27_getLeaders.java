package Lab_sheet_4;

public class Q27_getLeaders {
  public static void printLeaders(int [] arr){
    StringBuilder LEADERS= new StringBuilder("");
    for (int i = 0; i < arr.length; i++) {
      boolean greater=false;
      for (int j = i; j < arr.length-1; j++) {
        if(arr[i] > arr[j+1]){
          greater=true;
        }else{
          greater=false;
          break;
        }
      }
      if (greater) LEADERS.append(arr[i]).append(" ");
    }
    System.out.println("The leaders of the array are: "+LEADERS.toString());
  }
  public static void printArrVals(int [] arr){
    System.out.print(" Array: [ ");
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+((i< arr.length-1)? ", ":" "));
    }
    System.out.print("]\n");
  }
  public static void main(String[] args) {
    int [] arr={10,5,4,7,8,9,6,8,3,4,7};
    System.out.print("Initial");
    printArrVals(arr);
    printLeaders(arr);
  }
}
