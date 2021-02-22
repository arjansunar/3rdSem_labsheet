package Lab_sheet_2;

import java.util.Scanner;

public class Q20_nepaliNumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        String inputNumber = ""+number;
        StringBuilder nepaliFormat= new StringBuilder();
        String [] arr= inputNumber.split("");
        if (arr.length>3) {
            nepaliFormat.append(arr[0]);
            if (arr.length%2==0){
                nepaliFormat.append(",");
            }
            for (int i = 1; i < arr.length ; i++) {
                nepaliFormat.append(arr[i]);
                if (arr.length%2==0) {
                    if (i % 2 == 0 && i < arr.length - 3) {
                        nepaliFormat.append(",");
                    }
                }else{
                    if(i%2!=0 && i <arr.length-3){
                        nepaliFormat.append(",");
                    }
                }
            }
        }else{
            nepaliFormat.append(inputNumber);
        }
        System.out.println("In Nepali Format "+ nepaliFormat);

    }
}
