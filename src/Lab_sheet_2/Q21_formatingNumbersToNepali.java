package Lab_sheet_2;

import java.util.Scanner;

public class Q21_formatingNumbersToNepali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float number = sc.nextFloat();
        int diff = '१'-'1';
        String inputNumber = ""+number;
        StringBuilder nepaliNumber = new StringBuilder();
        String [] inputArr = inputNumber.split("");
        for (String i:inputArr) {
            if (i .equals(".")){
                nepaliNumber.append(".");
                continue;
            }
            char eachDigit = i.charAt(0);
            char eachNepaliDigit= (char)((int)eachDigit+ diff);
            nepaliNumber.append(eachNepaliDigit);
        }
        System.out.println("The number in nepali is "+ nepaliNumber);
    }
}
