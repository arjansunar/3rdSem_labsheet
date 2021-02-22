package Lab_sheet_3;

public class Q17_raisingPower {
  static int power(int m, int n ){
    int x=1;
    for (int i = 0 ; i < n;i++ ){
      x *=m;
    }
    return x;
  }
  static int power(int m){
    return power(m,2);
  }

  public static void main(String[] args) {
    System.out.println("when m =4 and n = 3: "+ power(4,3));
    System.out.println("when only m = 4: "+ power(4));
  }
}
