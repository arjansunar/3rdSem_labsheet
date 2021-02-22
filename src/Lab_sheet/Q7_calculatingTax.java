package Lab_sheet;

import java.util.Scanner;
public class Q7_calculatingTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you income amount ");
        int income = sc.nextInt();
        double  tax;
        if(income <=100000){
            tax= 0;
        }else if(  income <150000){
            tax= 0.1*(income-100000);
        }else if(  income <250000){
            tax= 5000+0.2*(income-150000);
        }else{
            tax= 25000+ 0.3*(income-250000);
        }
        System.out.println("The tax for "+income+" is: "+ tax);
    }
}
