package Lab_sheet;

import java.util.Scanner;

public class Q9_computingNetAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L for laptop or D for desktop");
        char typeOfProduct = sc.next().charAt(0);
        System.out.println("Enter the purchase amount");
        int amount = sc.nextInt();
        double discountRate= 0;
        if (typeOfProduct=='L'|| typeOfProduct=='l'){
            if (amount <= 25000) discountRate=0;
            else if (amount <=57000)discountRate= 5.0;
            else if (amount <=100000) discountRate=7.5;
            else discountRate=10.0;

        }else if (typeOfProduct=='D'|| typeOfProduct=='d'){
            if (amount <= 25000) discountRate=5.0;
            else if (amount <=57000)discountRate= 7.5;
            else if (amount <=100000) discountRate=10.0;
            else discountRate=15.0;
        }else {
            System.out.println("Please enter L or D");
        }
        double discount = (discountRate/100)*amount;
        double netAmount = amount- discount;
        System.out.println("the net amount is "+netAmount+" with a discount of "+discount);
    }
}
