package Lab_sheet_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q5_countCharacter {
  public static void main(String[] args) {
    char characterTofind= args[0].charAt(0);
    System.out.println("The number of '"+characterTofind+"' is: "+ countCharacterInFile(characterTofind));
  }
  public static int countCharacterInFile(char charaToFind){
    int count=0;
    try(Scanner sc = new Scanner(new File("text.txt"))){
      StringBuilder fileText= new StringBuilder();
      while (sc.hasNext()){
        fileText.append(sc.next());
      }
      String fileInput= fileText.toString();
      fileInput=fileInput.toLowerCase();
      System.out.println("Input: "+fileInput);
      for (int i = 0; i < fileInput.length(); i++) {
        if (charaToFind== fileInput.charAt(i)) count++;
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return count;
  }
}
