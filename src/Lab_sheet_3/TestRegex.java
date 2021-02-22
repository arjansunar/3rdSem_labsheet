package Lab_sheet_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("\\d{2,}", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("abc1");
    System.out.println("match: "+matcher.find());
  }
}
