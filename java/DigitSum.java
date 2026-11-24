public class DigitSum{
  public static void main(String[] args){
    for(int d1 = 1; d1 <= 9; d1++){
      for(int d2 = 0; d2 <= 9; d2++){
        for(int d3 = 0; d3 <= 9; d3++){
         int dOneSquare = d1 * d1;
         int dTwoSquared = d2 * d2;
         int dThreeSquared = d3 * d3;
         
        int sum = dOneSquare + dTwoSquared + dThreeSquared;
        int whole = (d1 * 100) + (d2 * 10) + (d3);
        if(sum == whole){
          System.out.print(whole);
        }
        }
      }
    }
  }
}
