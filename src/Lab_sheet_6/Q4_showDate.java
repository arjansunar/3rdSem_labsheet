package Lab_sheet_6;

public class Q4_showDate {
  public static void main(String[] args) {
    ShowDate showDate= new ShowDate();
    System.out.println("Default:\n"+ showDate.display());
    ShowDate showDate1= new ShowDate(2020,2,10);
    System.out.println("Parameterized:\n"+ showDate1.display());
  }
}
class ShowDate{
  private int year;
  private int month;
  private int day;

  public ShowDate(){
    this(0,0,0);
  }

  public ShowDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public String display(){
    return String.format("Year: %d\nMonth: %d\nDay: %d",year,month,day );
  }
}