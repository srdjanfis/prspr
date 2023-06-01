import java.util.Scanner;
class Inch{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double inch = scan.nextDouble();
    double meter = inch*0.0254;
    System.out.println("V metrih: " + meter);
  }
}
