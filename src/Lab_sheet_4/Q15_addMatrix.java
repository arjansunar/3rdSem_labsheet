package Lab_sheet_4;

import java.util.Arrays;

public class Q15_addMatrix {
  static int [][] addMatrix(int [][] matrix1,int [][] matrix2){
    int [][] sum = new int[matrix1.length][matrix1[0].length];
    for (int i=0; i < matrix1.length;i++){
      for (int j = 0; j < matrix1[0].length; j++) {
        sum[i][j]+=matrix1[i][j]+matrix2[i][j];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int [][] matrix1={{1,2,3},{4,5,6}},matrix2={{0,1,2},{3,4,5}};
    System.out.println("Initial matrices are: ");
    for (int []i:matrix1) {
      System.out.println(Arrays.toString(i));
    }
    System.out.println("and: ");
    for (int []i:matrix2) {
      System.out.println(Arrays.toString(i));
    }
    System.out.println("The sum is: ");
    int [][] sum = addMatrix(matrix1,matrix2);
    for (int []i:sum) {
      System.out.println(Arrays.toString(i));
    }
  }
  }

