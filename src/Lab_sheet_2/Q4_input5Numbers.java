package Lab_sheet_2;

import java.util.Scanner;

public class Q4_input5Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        System.out.println("Enter 5 numbers");
        int sum = 0 , avg;
        for (int i =0;i< numbers.length;i++) {
            numbers[i] = sc.nextInt();
            sum+=numbers[i];
        }
        avg= sum/ numbers.length;
        System.out.println("The sum of the numbers is: "+sum);
        System.out.println("The average of the numbers is: "+avg);
    }
}
