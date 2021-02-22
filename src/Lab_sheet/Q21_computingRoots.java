package Lab_sheet;

import java.util.Scanner;

public class Q21_computingRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a,b,c representing the constants of a quadratic eqn...");
        int a = sc.nextInt(), b= sc.nextInt(),c= sc.nextInt();
        double discriminant= Math.pow(b,2) - 4*a*c;
        if (discriminant<0){
            System.out.println("The roots are imaginary.");
        }else{
            double root1 = (-b + Math.sqrt(discriminant))/(2*a);
            double root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The roots are "+root1+" and "+root2);
        }
    }
}
