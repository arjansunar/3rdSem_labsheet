package Lab_sheet;

import java.util.Scanner;

public class Q31_isTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of three sides ");
        int [] sides = new int[3];
        for (int i = 0 ; i < sides.length; i++){
            sides[i]=sc.nextInt();
        }
        //validating if it is a triangle
        boolean isValidTriangle=false;
        if ((sides[0]+sides[1])>= sides[2] && (sides[1]+sides[2])>= sides[0] &&(sides[0]+sides[2])>= sides[1])
            isValidTriangle= true;
        //checking the type of triangle if true
        if (isValidTriangle){
            if (sides[0]==sides[1] && sides[1] ==sides[2])
                System.out.println("Its an equilateral triangle.");
            else if(sides[0]==sides[1] || sides[1] ==sides[2] || sides[2]==sides[0])
                System.out.println("Its an isosceles triangle.");
            else
                System.out.println("Its a scalene triangle.");
        }else
        System.out.println("Its not a valid triangle");
    }
}
