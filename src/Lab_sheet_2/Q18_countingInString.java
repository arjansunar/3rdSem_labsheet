package Lab_sheet_2;

import java.util.Scanner;

public class Q18_countingInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String inputText = sc.nextLine();
        String [] input = inputText.split("");
        int noOfUpperCase=0,noOFLowerCase=0,noOfDigits=0,otherCharacters=0;
        for (String i: input ){
            char character = i.charAt(0);
            if ((character >= 'A' && character <= 'Z')) {
                noOfUpperCase++;
            } else if ((character >= 'a' && character <= 'z')) {
                    noOFLowerCase++;
                } else if ((character >= '0' && character <= '9')) {
                        noOfDigits++;
                    } else {
                        otherCharacters++;
                    }
        }
        System.out.print(((noOfUpperCase!=0)?"\nThe number of uppercase letters are: "+ noOfUpperCase: "") +((noOFLowerCase!=0)?"\nThe number of lowercase letters are: "+ noOFLowerCase :"")+((noOfDigits!=0)?"\nThe number of digits are: " + noOfDigits:"")+ ((otherCharacters!=0)?"\nThe number of other characters are: "+ otherCharacters:""));
    }
}


