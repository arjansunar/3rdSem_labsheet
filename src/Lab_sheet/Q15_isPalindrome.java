package Lab_sheet;

import java.util.Scanner;

public class Q15_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int number = sc.nextInt();
        int tempNum = number;
        int newNum = 0;
        newNum += number%10 * 100;
        number/=10;
        newNum += number%10*10;
        number/=10;
        newNum += number%10;
        if (tempNum==newNum){
            System.out.println(tempNum+" is Palindrome");
        }else{
            System.out.println(tempNum+" is not Palindrome");
        }
    }
}
