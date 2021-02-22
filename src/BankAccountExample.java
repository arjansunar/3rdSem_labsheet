public class BankAccountExample {
  public static void main(String[] args) {
    BankAccount bankAccount= new BankAccount("1,00,000");
    System.out.println("Amount is: "+ bankAccount.getBalance());
    bankAccount.withdraw("50,000");
    System.out.println("Amount is: "+ bankAccount.getBalance());

  }
}
class BankAccount{
  private double balance;

  public BankAccount() {
  }

  public BankAccount(double startBalance) {
    this.balance = balance;
  }

  public BankAccount(String str){
    balance= Double.parseDouble(removeCommas(str));
  }
  private String removeCommas(String str){
    return str.replace(",","");
  }
  public void deposit(double amount){
    if (amount>0) balance+= amount;
  }

  public void deposit(String str){
    double amount = Double.parseDouble(removeCommas(str));
    deposit(amount);
  }

  public void withdraw( double amount){
     if (amount<balance) balance-=amount;
  }

  public void withdraw(String str){
    double amount = Double.parseDouble(removeCommas(str));
    withdraw(amount);
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setBalance(String balance) {
    this.balance = Double.parseDouble(removeCommas(balance));
  }
  public double getBalance() {
    return balance;
  }
}