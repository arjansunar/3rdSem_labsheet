package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q14_getSumMatrix {
  public static int[][] get2DSum(int[][] matrix){
    int [][] finalMatrix = new int[matrix.length+1][matrix[0].length+1];
    int totalSum=0;
    for(int i=0;i< matrix.length;i++){
      int sumRow=0;
      for (int j = 0; j < matrix[0].length; j++) {
        finalMatrix[i][j]=matrix[i][j];
        sumRow+=matrix[i][j];
      }
      //adding the row sum
      finalMatrix[i][finalMatrix[0].length-1]=sumRow;
      totalSum+=sumRow;
    }
    for(int i=0;i< matrix[0].length;i++){
      int sumCol=0;
      for (int[] ints : matrix) {
        sumCol += ints[i];
      }
      //adding the col sum
      finalMatrix[finalMatrix.length-1][i]=sumCol;
    }
    finalMatrix[finalMatrix.length-1][finalMatrix[0].length-1]=totalSum;
    return finalMatrix;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the values for a matrix:");
    System.out.println("No of Rows: ");
    int rows = sc.nextInt();
    System.out.println("No of Columns: ");
    int cols = sc.nextInt();
    int [][] matrix = new int[rows][cols];
    System.out.println("Insert the values for each rows: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j]=sc.nextInt();
      }
    }
    int [][] finalMatrix = get2DSum(matrix);
    System.out.println("Final Matrix: ");
    for (int[] ints : finalMatrix) {
      System.out.println(Arrays.toString(ints));
    }
  }
}
