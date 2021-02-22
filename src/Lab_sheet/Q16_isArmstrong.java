package Lab_sheet;

import java.util.Scanner;

public class Q16_isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int number = sc.nextInt();
        int tempNum = number;
        int sum = 0;
        sum += Math.pow(number%10,3) ;
        number/=10;
        sum += Math.pow(number%10,3);
        number/=10;
        sum += Math.pow(number%10,3);
        if (tempNum==sum){
            System.out.println(tempNum+" is Armstrong");
        }else{
            System.out.println(tempNum+" is not Armstrong");
        }
    }
}

