package Lab_sheet_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q4_histogram {
  private int integersInRange = 0;
  private int noOfNumbers=0;
  private final int[] range= new int[10];
  public static void main(String[] args) {
    Q4_histogram histogram= new Q4_histogram();
    histogram.writeHistogram(histogram.generateHistogram());
  }
  public String generateHistogram(){
    StringBuilder output= new StringBuilder();
    try(Scanner sc = new Scanner(new File("src/Lab_sheet_8/myFile.txt"))){
      while (sc.hasNext()){
        String val=sc.next();
        int number=Integer.parseInt(val);
        if(number>=1 &&number<=100) {
          integersInRange++;
          range[number/10]++;
        }
        noOfNumbers++;
      }
      output.append("Number of integers in the interval [1-100]: ")
              .append(integersInRange).append("\nOthers: ")
              .append(noOfNumbers - integersInRange).append("\n");
      for (int i=0; i<range.length;i++) {
        output.append(i * 10 + 1).append(" - ").append((i + 1) * 10).append(" | ");
        output.append("*".repeat(range[i]));
        output.append("\n");
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    return output.toString();
  }

  public void writeHistogram(String output){
    try(FileWriter writer = new FileWriter("src/Lab_sheet_8/histogram.txt")){
      writer.write(output);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
