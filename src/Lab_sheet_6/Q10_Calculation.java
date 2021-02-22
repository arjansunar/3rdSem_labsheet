package Lab_sheet_6;

public class Q10_Calculation {
  public static void main(String[] args) {
    Calculation calculation= new Calculation();
    calculation.num_calc(4);
    calculation.num_calc(2,3);
    calculation.num_calc("hello ","world");
  }
}
class Calculation{
  void num_calc(int num){
    int square = num*num;
    System.out.println("Square of "+ num+" is "+ square);
  }

  void num_calc(int a , int b){
    int product = a*b;
    System.out.println("Product is "+ product);
  }

  void num_calc(String s1,String s2){
    String concat= s1+s2;
    System.out.println("Concatination: "+concat);
  }
}
