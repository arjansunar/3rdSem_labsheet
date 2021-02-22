package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q17_getTranspose {
  static int[][] getTranspose(int[][] matrix){
    int[][] transpose= new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        transpose[j][i]=matrix[i][j];
      }
    }
    return transpose;
  }
  static void inputMatrix(int[][] matrix,Scanner sc){
    int rows=matrix.length,cols=matrix[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j]=sc.nextInt();
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the order for 1st matrix ");
    int rows= sc.nextInt();
    int cols= sc.nextInt();
    System.out.println("Enter the values: ");
    int [][] matrix = new int[rows][cols];
    inputMatrix(matrix,sc);
    System.out.println("Input: ");
    for (int[] i :matrix) {
      System.out.println(Arrays.toString(i));
    }
    int [][]result = getTranspose(matrix);
    System.out.println("Result: ");
    for (int[] i :result) {
      System.out.println(Arrays.toString(i));
    }
  }
}
