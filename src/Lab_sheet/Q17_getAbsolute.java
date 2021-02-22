package Lab_sheet;

import java.util.Scanner;

public class Q17_getAbsolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.. ");
        int number = sc.nextInt();
        if (number<0){
          number*=-1;
        }
        System.out.println("The absolute value is: "+ number);
    }
}
