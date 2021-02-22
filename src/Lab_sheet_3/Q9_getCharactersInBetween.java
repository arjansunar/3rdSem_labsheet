package Lab_sheet_3;

import java.util.Scanner;

public class Q9_getCharactersInBetween {
  static char [] charInBetween (char start , char end ){
    char [] arr= new char[Math.abs(start-end)+1];
    int index=0;
    if (Math.max(start,end)==start){
      char temp = start;
      start= end;
      end=temp;
    }
    for(int i = start; i<=end; i++){
      arr[index]= (char)i;
      index++;
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the starting and ending characters");
    char start = sc.next().charAt(0);
    char end = sc.next().charAt(0);
    char [] arr = charInBetween(start,end);
    for(int i = 0; i < arr.length;i++){
      if (i%20==0){
        System.out.println();
      }
      System.out.print(arr[i]+" ");
    }
  }
}
