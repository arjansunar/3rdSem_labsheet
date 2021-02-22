package Lab_sheet;


import java.util.Scanner;

public class Q13_reversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int inputNumber= sc.nextInt();
        int newNumber=0;
        int count=2;
        while(inputNumber>0){
            int remainder = inputNumber% 10;
//            System.out.println("remainder:"+ remainder);
            newNumber += remainder*Math.pow(10,count) ;
            inputNumber = inputNumber/10;
            count--;

        }
        System.out.println("RESULT: "+ newNumber);

    }
}
