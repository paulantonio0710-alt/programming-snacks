import java.util.Scanner;
import java.security.SecureRandom;
public class NumberGuess{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    SecureRandom randy = new SecureRandom();
    
    int random = 1 + randy.nextInt(100);
    int count = 1;
    System.out.print("Try to guess my number between 1 and 100: ");
    int guess = input.nextInt();
    while(guess != random){
      if(guess < random){
        System.out.println("Too low. Try again.");
      }
      else{
        System.out.println("Too high. Try again.");
      }
      guess = input.nextInt();
      ++count;
    }
    System.out.printf("Congratulations! You guessed correctly.%nIt took you %d tries.%n", count);
    
  }
}
