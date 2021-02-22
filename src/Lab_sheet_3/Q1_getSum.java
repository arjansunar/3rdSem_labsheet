package Lab_sheet_3;

public class Q1_getSum {
  int getSum (int num1,int num2){
    return num1+num2;
  }

  public static void main(String[] args) {
    Q1_getSum object = new Q1_getSum();
    int sum =object.getSum(5,4);
    System.out.println("Sum is "+sum);
  }
}
