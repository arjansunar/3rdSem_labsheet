package Lab_sheet;

import java.util.Scanner;

public class Q18_getWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 ");
        int number = sc.nextInt();
        int weekDay = number%7;
        String day="";
        switch (weekDay){
            case 1 -> day = "Sunday";
            case 2 -> day = "Monday";
            case 3 -> day = "Tuesday";
            case 4 -> day = "Wednesday";
            case 5 -> day = "Thursday";
            case 6 -> day = "Friday";
            case 0 -> day = "Saturday";
        }
        System.out.println("The day is "+ day);
    }
}
