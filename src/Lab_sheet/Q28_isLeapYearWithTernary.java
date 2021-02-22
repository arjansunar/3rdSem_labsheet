package Lab_sheet;

import java.util.Scanner;

public class Q28_isLeapYearWithTernary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        String result;
        result = (year % 400 ==0 )?
            " is a leap year":
                (year % 100==0)?
                    " is not a leap year":
                        (year % 4==0)? " is a leap year": " is not a leap year";
        System.out.println(year + result);

    }
}
