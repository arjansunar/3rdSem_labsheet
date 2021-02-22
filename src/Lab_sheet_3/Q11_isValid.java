package Lab_sheet_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidatePassword{

  boolean isValid(String password){
    return checkLettersAndDigits(password)&& checkNumberOfCharacters(password)&& checkNumberOfDigits(password);
  }

  boolean checkNumberOfCharacters(String password){
    return password.length()>=10;
  }
  boolean checkLettersAndDigits(String password){
    Pattern pattern = Pattern.compile("[\\W_]", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(password);
    return !matcher.find();
  }
  boolean checkNumberOfDigits(String password){
    Pattern pattern = Pattern.compile("\\d{2,}");
    Matcher matcher = pattern.matcher(password);
    return matcher.find();
  }
}
public class Q11_isValid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Rules:\n1. A password must have at least ten characters.\n" +
            "2. A password consists of only letters and digits.\n" +
            "3. A password must contain at least two digits.");
    System.out.println("Enter a password");
    String password = sc.next();
    ValidatePassword validator = new ValidatePassword();
    System.out.println("Password is "+(validator.isValid(password)?"valid.":"invalid."));
  }
}
