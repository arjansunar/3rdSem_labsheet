package Lab_sheet_2;

import java.util.Scanner;

public class Q9_repeatNumberRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        for (int i = 1 ;i <= rows; i++){
            for (int j= 1; j <=i;j++  ){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
