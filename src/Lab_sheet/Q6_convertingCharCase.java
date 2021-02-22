package Lab_sheet;

import java.util.Scanner;

public class Q6_convertingCharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = sc.next().charAt(0);
        if (character >='A' && character <= 'Z'){
            character += 32;
            System.out.println(character +" is now lower cased");
        }
        else if (character >='a' && character <= 'z'){
            character-=32;
            System.out.println(character +" is now upper cased");
        }
        else{
            System.out.println(character +" is not an alphabet");
        }
    }
}
