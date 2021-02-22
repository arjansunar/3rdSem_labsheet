package Lab_sheet_6;

public class Q2_BankAccount {
  public static void main(String[] args) {
    BankAccount account= new BankAccount("Aryan","00044ab","saving",1000);
    account.displayAccountInformation();
    account.deposit(500);
    account.displayAccountInformation();
    double withdraw = account.withdraw(1000);
    System.out.println((withdraw>0)? "The amount withdrawn is: "+ withdraw:"insufficient balance");
    account.displayAccountInformation();
  }
}

class BankAccount{
  private String name;
  private String accountNumber;
  private String typeOfAccount;
  private double balance;

  public BankAccount(String name, String accountNumber,String typeOfAccount, double balance){
    this.accountNumber=accountNumber;
    this.name=name;
    this.typeOfAccount=typeOfAccount;
    this.balance=balance;
  }

  public void deposit(double amount){
    balance+=amount;
  }

  public double withdraw(double amount){
    if (amount <balance) {
      balance -= amount;
      return amount;
    }
    return -1;
    }

  public void displayAccountInformation(){
    System.out.println("Name:\t\t"+ name);
    System.out.println("Balance:\t"+ balance);
  }
  }
