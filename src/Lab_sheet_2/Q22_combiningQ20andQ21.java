package Lab_sheet_2;

import java.util.Scanner;

public class Q22_combiningQ20andQ21 {
    public static String getNepaliFormat(int number ){
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
        return nepaliFormat.toString();

    }
    public static String convertToNepali(String inputNumber){
        int diff = '१'-'1';
        StringBuilder nepaliNumber = new StringBuilder();
        String [] inputArr = inputNumber.split("");
        for (String i:inputArr
        ) {
            if (i .equals(",")){
                nepaliNumber.append(",");
                continue;
            }
            char eachDigit = i.charAt(0);
            char eachNepaliDigit= (char)((int)eachDigit+ diff);
            nepaliNumber.append(eachNepaliDigit);
        }
        return nepaliNumber.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = sc.nextInt();
        System.out.println("enter e for English and n for Nepali");
        char inputCharacter = sc.next().charAt(0);
        String formattedNumber="";
        if (inputCharacter=='e'){
            formattedNumber= getNepaliFormat(number);
        }else if (inputCharacter=='n'){
            formattedNumber= convertToNepali(getNepaliFormat(number));
        }else {
            System.out.println("Enter the right character");
        }
        System.out.println("Output : "+ formattedNumber);
    }
}
