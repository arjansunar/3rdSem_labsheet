package Lab_sheet_2;

import java.util.Scanner;

public class Q26_PIN_Verification {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int SECRET_PIN = 5730;
        System.out.println("Please input the PIN:" );
        int attempts=3;
        while (true){
            int input=sc.nextInt();
            if(input==SECRET_PIN ) {
                System.out.println("SUCCESS!!");
                break;
            }
            if (attempts==0){
                System.out.println("NO MORE ATTEMPTS!!");
                break;
            }
            System.out.println("Sorry, your PIN is incorrect. You have "+--attempts+" attempts left. ");
        }
    }
}
