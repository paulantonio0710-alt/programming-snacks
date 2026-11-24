import java.util.Scanner;
public class EvenIndex{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Type in a word: ");
    String word = input.nextLine();

    for(int count = 1; count < word.length(); count += 2){
        System.out.printf("'%s'%n", word.charAt(count));
    }
  }
}
