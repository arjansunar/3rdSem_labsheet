package Lab_sheet_2;

import java.util.Scanner;

public class Q10_rightAngleTriangleWithIncreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        int output=1;
        for (int i = 1 ;i <= rows; i++){
            for (int j= 1; j <=i;j++  ){
                System.out.print(output+" ");
                output++;
            }
            System.out.println();
        }
    }
}
