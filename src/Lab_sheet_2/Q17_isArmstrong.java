package Lab_sheet_2;

import java.util.Scanner;

public class Q17_isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int number = sc.nextInt();
        int tempNum = number;
        int sum = 0;
        while (number>0) {
            sum += Math.pow(number % 10, 3);
            number /= 10;
        }
        if (tempNum==sum){
            System.out.println(tempNum+" is Armstrong");
        }else{
            System.out.println(tempNum+" is not Armstrong");
        }
    }
}
