package Lab_sheet_6;

public class Q11_power {
  static int power(int m, int n){
    return (int)Math.pow(m,n);
  }
  static int power(int m){
    return (int)Math.pow(m,2);
  }

  public static void main(String[] args) {
    System.out.println("power of m to n (2,3): "+ power(2,3));
    System.out.println("power of m: "+ power(4));
  }
}
