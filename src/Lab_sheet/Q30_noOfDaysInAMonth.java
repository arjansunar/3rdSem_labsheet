package Lab_sheet;

import java.util.Scanner;

public class Q30_noOfDaysInAMonth {
    public static int getNoOfDays(int month, boolean isLeapYear){
        //counting the number of days in a given month
        if (month == 7 ){
            return 31;
        }
        else if ((month % 7)%2 != 0  ){
            return 31;
        }else if (month ==2 ){
            if (isLeapYear)  return 29;
            return 28;
        }else {
            return 30;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month number: ");
        int month = sc.nextInt();
        System.out.println("Input a year: ");
        int year = sc.nextInt();

        boolean isLeapYear;
        //checking for leap year
        if (year % 400 ==0 ){
            isLeapYear= true;
        }else if (year % 100==0){
            isLeapYear=false;
        }else if (year % 4==0){
            isLeapYear=true;

        }else {
            isLeapYear=false;
        }
        //getting the number of days
        int numberOfDays = getNoOfDays(month,isLeapYear);

        // finding the month name
        String nameOfMonth="";
        switch (month){
            case 1 :
                nameOfMonth="January";
                break;
            case 2 :
                nameOfMonth="February";
                break;
            case 3 :
                nameOfMonth="March";
                break;
            case 4 :
                nameOfMonth="April";
                break;
            case 5 :
                nameOfMonth="May";
                break;
            case 6 :
                nameOfMonth="June";
                break;
            case 7 :
                nameOfMonth="July";
                break;
            case 8 :
                nameOfMonth="August";
                break;
            case 9 :
                nameOfMonth="September";
                break;
            case 10 :
                nameOfMonth="October";
                break;
            case 11 :
                nameOfMonth="November";
                break;
            case 12 :
                nameOfMonth="December";
                break;
            default:
                System.out.println("Please enter valid month number");

        }
        System.out.println(nameOfMonth + " "+year+" has "+ numberOfDays);
    }
}
