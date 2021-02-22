package Lab_sheet_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q14_getTwinPrime {
  static void getTwinPrime(){
    ArrayList<Integer> primeLessThan100= getPrimeLessthan100();
    for(int i = 0 ; i < primeLessThan100.size()-1;i++){
      int current = Integer.parseInt(primeLessThan100.get(i).toString());
      int next=Integer.parseInt(primeLessThan100.get(i+1).toString());
      if(next-current==2){
        System.out.println("("+current+","+next+")");
      }
    }
  }
  static ArrayList<Integer> getPrimeLessthan100(){
    ArrayList<Integer>Prime = new ArrayList<>();
    for(int i =2 ; i <100;i++){
      boolean isPrime=true;
      for (int j =2 ; j < i;j++){
        if (i%j==0){
          isPrime=false;
          break;
        }
      }
      if (isPrime) Prime.add(i);
    }

    return Prime;
  }

  public static void main(String[] args) {
    getTwinPrime();
  }
}
