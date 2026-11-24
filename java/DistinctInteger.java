import java.util.Scanner;
public class DistinctInteger{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a target value: ");
    int target = input.nextInt();
    boolean status = false;
    
    for(int d1 = 1; d1 <= 9; d1++){
      for(int d2 = 1; d2 <= 9; d2++){
        for(int d3 = 1; d3 <= 9; d3++){
          if(d1 + d2 + d3 == target){
            System.out.printf("%d + %d + %d = %d.%n", d1, d2, d3, target);
            status = true;
          }
          else{
            continue;
          }
        }
      }
    }
    if(!status){
      System.out.printf("No three distinct integers from 1 - 9 could sum up to %d.%n", target);
    }
  }
}
