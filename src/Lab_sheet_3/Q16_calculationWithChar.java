package Lab_sheet_3;

public class Q16_calculationWithChar {
  static double operation(int num1,int num2,char sign){
    switch (sign){
      case '+' -> { return num1+num2; }
      case '-' -> { return num1-num2; }
      case '/' -> { return ((double) num1)/num2; }
      case '*' -> { return num1*num2; }
      default ->{return 0;}
    }
  }

  public static void main(String[] args) {
    System.out.println("operation(2,5,’*’): "+operation(2,5,'*'));
  }
}
