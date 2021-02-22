import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2nd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int []storeSales = new int[3];

    System.out.println("Today's sales Report: ");
    for (int i = 0; i < storeSales.length; i++) {
      System.out.println("Enter today's sales for store "+ (i+1) +":");
      storeSales[i]= sc.nextInt();
    }
    barchart(storeSales);
    percentageOfSales(storeSales);
  }

  public static void barchart( int [] storeSales){
    int count =1;
    for (int storeSale : storeSales) {
      int noOfStars = storeSale/1000;
      System.out.print("\nStore " + count++ + ": ");
      for (int i = 0; i < noOfStars; i++) {
        System.out.print("*");
      }
    }
  }
  public static void percentageOfSales(int [] storeSales){
    DecimalFormat df = new DecimalFormat(".##");
    //getting total
    int totalSales=0;
    for (int storeSale : storeSales) {
      totalSales+=storeSale;
    }
    System.out.println("\nPercentage of sales");
    int count=0;
    for (int storeSale : storeSales) {
      System.out.println("Store "+ ++count +": " + df.format(((double)storeSale/totalSales)*100) + "%");
    }
  }
}
