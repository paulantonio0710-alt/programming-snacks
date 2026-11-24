import java.util.Scanner;
public class ISBN{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your 13 digit ISBN: ");
    long isbn = input.nextLong();
    int sum = 0;
    long lastDigit = isbn % 10;
    long savedDigits = isbn / 10;
    int count = 1;
    for(; savedDigits > 0; savedDigits/=10){
      if(count % 2 == 0){
        sum += savedDigits % 10;
      }
      else{
        sum += (savedDigits % 10) * 3;
      }
      ++count;
    }
    int check = (10 - sum % 10) % 10;
    
    if(lastDigit == check){
      System.out.printf("%d is valid.%n", isbn);
    }
    else{
      System.out.printf("%d is not valid.%n", isbn);
    }
  }
}
