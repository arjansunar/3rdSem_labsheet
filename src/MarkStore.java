import java.text.DecimalFormat;
import java.util.Scanner;

public class MarkStore {
  public static void main(String[] args) {
    final int STUDENTS = 2;
    final int SUBJECTS = 3;
    double[][] marks = new double[STUDENTS][SUBJECTS];

    //taking input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three marks for:");
    for (int i = 0; i < marks.length; i++) {
      System.out.println("Student "+(i+1)+":" );
      for (int j = 0; j < marks[0].length; j++) {
        System.out.println("Assignment "+ (j+1)+":");
        marks[i][j]= sc.nextDouble();
      }
    }

    System.out.println("\nTotal and average for each student");
     totalAverageStd(marks);
    System.out.println("\nTotal and average for each Assignment");
     totalAverageAssignments(marks);
    // define required methods
    // refer to sample output for details in next page
  }
  static void totalAverageStd(double [][] scores){
    //getting total for student 1
    double totalForStudent1=0;
    for (double i : scores[0]) {
      totalForStudent1+=i;
    }
    //getting total for student 2
    double totalForStudent2=0;
    for (double i : scores[1]) {
      totalForStudent2+=i;
    }

    double avgStd1 = totalForStudent1/ scores[0].length;
    double avgStd2 = totalForStudent2/ scores[0].length;

    DecimalFormat df = new DecimalFormat(".##");
    System.out.println("Student 1: Total scores: "+ totalForStudent1+ "\t\tAverage: "+ df.format(avgStd1));
    System.out.println("Student 2: Total scores: "+ totalForStudent2+ "\t\tAverage: "+ df.format(avgStd2));
  }

  static void totalAverageAssignments(double [][] scores){
    double[][] totalForAssignment=new double[scores[0].length][2];
    for (int i = 0; i < totalForAssignment.length; i++) {
      for (double[] score : scores) {
        totalForAssignment[i][0] += score[i];
      }
    }
    for (int i = 0; i < totalForAssignment.length; i++) {
      totalForAssignment[i][1]=totalForAssignment[i][0]/2;
    }

    //output
    DecimalFormat df = new DecimalFormat(".##");
    for (int i = 0; i < totalForAssignment.length; i++) {
      System.out.println("Assignment "+(i+1)+": Total scores: "+totalForAssignment[i][0]+"\tAverage: "+df.format(totalForAssignment[i][1]));
    }
  }
}
