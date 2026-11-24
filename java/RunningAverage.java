import java.util.Scanner;
public class RunningAverage{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count = 0;
    double sum = 0;
    System.out.print("Enter number(press -1 to end): ");
    int number = input.nextInt();
    while(number != -1){
        ++count;
        sum += number;
        double average = sum / count;
        System.out.printf("%.2f%n", average);
        System.out.print("Enter number(press -1 to end): ");
        number = input.nextInt();
        
    }
  }
}
