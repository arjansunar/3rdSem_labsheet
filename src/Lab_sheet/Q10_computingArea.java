package Lab_sheet;

import java.util.Scanner;

public class Q10_computingArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose \nC -> circle\nR -> rectangle\nS -> square ");
        char typeOFShape= sc.next().charAt(0);
        if (typeOFShape=='C' || typeOFShape=='c' ) {
            System.out.println("Enter the radius of the circle");
            int radius = sc.nextInt();
            double areaOfCircle= Math.PI * Math.pow(radius,2);
            System.out.println("The area of the circle is: "+ areaOfCircle);
        }else if (typeOFShape=='R' || typeOFShape=='r') {
            System.out.println("Enter the length and breadth of the rectangle\n\t length -> ");
            int length  = sc.nextInt();
            System.out.println("Breadth -> " );
            int breadth  = sc.nextInt();

            int areaOfRectangle= length*breadth;
            System.out.println("The area of the rectangle is: "+ areaOfRectangle);
        }
        else if (typeOFShape=='S' || typeOFShape=='s'){
            System.out.println("Enter the length of the square");
            int length  = sc.nextInt();
            int areaOfSquare= length*length;
            System.out.println("The area of the square is: "+ areaOfSquare);
        }
        else {
            System.out.println("Please enter the valid character");
        }
    }
}
