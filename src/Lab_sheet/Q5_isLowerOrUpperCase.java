package Lab_sheet;

import java.util.Scanner;

public class Q5_isLowerOrUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = sc.next().charAt(0);
        if (character >='A' && character <= 'Z'){
            System.out.println(character +" is upper cased");
        }
        else if (character >='a' && character <= 'z'){
            System.out.println(character +" is lower cased");
        }
        else{
            System.out.println(character +" is not an alphabet");
        }
    }
}
