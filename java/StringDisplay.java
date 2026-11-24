import java.util.Scanner;
public class StringDisplay{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String text = input.nextLine();
    
    for(int count = 0; count < text.length(); count++){
      System.out.println(text.charAt(count));
    }
  }
}
