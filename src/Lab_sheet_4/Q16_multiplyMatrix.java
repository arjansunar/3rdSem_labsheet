package Lab_sheet_4;

import java.util.Arrays;
import java.util.Scanner;

public class Q16_multiplyMatrix {
  static int[][] multiplyMatrix(int[][] matrix1,int [][] matrix2){
    int [][] result = new int[matrix1.length][matrix2[0].length];
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        int sum=0;
        for (int k = 0; k < matrix1[0].length; k++) {
          sum += matrix1[i][k] * matrix2[k][j];
        }
        result[i][j]=sum;
      }

    }
    return result;
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

    System.out.println("Enter the values for 1st matrix ");
    System.out.println("Enter no of rows:");
    int rowFirst = sc.nextInt();
    System.out.println("Enter no of columns:");
    int colFirst= sc.nextInt();

    System.out.println("Enter the for 2nd matrix ");
    System.out.println("Enter no of rows:");
    int rowSecond = sc.nextInt();
    System.out.println("Enter no of columns:");
    int colSecond= sc.nextInt();

    if (colFirst==rowSecond){
      int [][] matrix1 = new int[rowFirst][colFirst];
      int [][] matrix2 = new int[rowSecond][colSecond];
      System.out.println("Enter the values for 1st matrix");
      inputMatrix(matrix1,sc);
      System.out.println("Enter the values for 2nd matrix");
      inputMatrix(matrix2,sc);
      int [][] result= multiplyMatrix(matrix1,matrix2);
      System.out.println("The result of matrix multiplication: ");
      for (int[] i :result) {
        System.out.println(Arrays.toString(i));
      }
    }else System.out.println("Not eligible to multiply.");
  }
}
