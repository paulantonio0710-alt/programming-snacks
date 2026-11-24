import java.util.Scanner;
public class VowelAndConsonants{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = input.nextLine();

    int vowelCount = 0;
    int consonantCount = 0;

    for(int count = 0; count < word.length(); count++){
        if(word.charAt(count) == 'a' || word.charAt(count) == 'e' || word.charAt(count) == 'i' || word.charAt(count) == 'o' || word.charAt(count) == 'u'){
            vowelCount += 1;
        }
        else{
            consonantCount += 1;
        }
    }
    System.out.println(vowelCount);
    System.out.println(consonantCount);
  }
}
