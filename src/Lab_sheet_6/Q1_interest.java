package Lab_sheet_6;

public class Q1_interest {
  public static void main(String[] args) {
    Interest interest = new Interest(1000,10,5);
    System.out.println("The interest is: "+ interest.calculateInterest());
  }
}
class Interest {
  private int principle;
  private int time;
  private int rate;

  public Interest(int principle,int rate, int time){
    this.principle=principle;
    this.rate=rate;
    this.time=time;
  }

  public double calculateInterest(){
    return ((double) principle*time*rate)/100;
  }

  public int getPrinciple() {
    return principle;
  }

  public int getTime() {
    return time;
  }

  public int getRate() {
    return rate;
  }

  public void setPrinciple(int principle) {
    this.principle = principle;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }
}