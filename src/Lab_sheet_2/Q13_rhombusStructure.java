package Lab_sheet_2;

import java.util.Scanner;

public class Q13_rhombusStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        int noOfRepetitions=1;
        //top half
        for (int i =1 ; i < rows ; i++){
            //spaces
            for (int space = rows; space>i;space--){
                System.out.print(" ");
            }
            int addVal = 0;
            //single row
            for (int k = 0; k < noOfRepetitions; k++) {
                System.out.print(i+addVal);
                if (k< (noOfRepetitions/2)) {
                    addVal-=1;
                }else{
                    addVal+=1;
                }
            }
            noOfRepetitions+=2;
            System.out.println();
        }
        //bottom half
        for(int j = rows; j >0;j--){
            //spaces
            for (int space = rows; space>j;space--){
                System.out.print(" ");
            }
            int addVal = 0;
            //single row
            for (int l = 0; l < noOfRepetitions; l++) {
                System.out.print(j+addVal);
                if (l< (noOfRepetitions/2)) {
                    addVal-=1;
                }else{
                    addVal+=1;
                }
            }
            noOfRepetitions-=2;

            System.out.println();
        }
    }
}
