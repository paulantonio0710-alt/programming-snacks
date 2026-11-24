import java.util.Scanner;
public class Reversed{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter word: ");
      String word = input.next();
      String reversed = "";
      for(int count = 0; count < word.length(); count++){
          reversed = word.charAt(count) + reversed;
      }
      System.out.println(reversed);
   
  }
}
