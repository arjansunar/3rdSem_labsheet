package Lab_sheet_4;

import java.util.ArrayList;

public class Q25_removeDuplicates {
  public static int removeDuplicates(int []arr){
    ArrayList<Integer> uniqueArr= new ArrayList<>();
    for (int i :arr){
      if (!uniqueArr.contains(i)){
        uniqueArr.add(i);
      }
    }
    return uniqueArr.size();
  }

  public static void main(String[] args) {
    int [] arr = {20, 20, 30, 40, 50, 50, 50};
    System.out.println("Array: {20, 20, 30, 40, 50, 50, 50}\nLength after removing duplicates: "+ removeDuplicates(arr));
  }
}
