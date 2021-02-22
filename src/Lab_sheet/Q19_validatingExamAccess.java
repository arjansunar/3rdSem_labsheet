package Lab_sheet;

import java.util.Scanner;

public class Q19_validatingExamAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of classes held");
        int totalClasses= sc.nextInt();
        System.out.println("Enter the Number of classes attended");
        int attendedClasses= sc.nextInt();
        double percentage = (double)attendedClasses/(double) totalClasses;
        System.out.println("Percentage of class attended: "+ (int)(percentage*100));
        if (percentage <0.75){
            System.out.println("Do you have a medical reason ? (Y?N)");
            char input = sc.next().charAt(0);
            if (input =='Y'||input=='y'){
                System.out.println("The student is allowed to sit in the exam.");
            }else {
                System.out.println("The student is not allowed to sit in the exam.");
            }
        }else{
                 System.out.println("The student is allowed to sit in the exam.");
        }
    }
}

