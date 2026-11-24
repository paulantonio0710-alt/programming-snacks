import java.util.Scanner;
public class StringPalindrome{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String text = input.next();
    String reversed = "";
    for(int count = 0; count < text.length(); count++) {
        reversed = text.charAt(count) + reversed;
    }
    if(reversed.equals(text)){
        System.out.printf("%s is a palindrome.%n", reversed);
    }
    else{
        System.out.printf("%s is not a palindrome.%n", text);
    }
    
  }
}
