import java.util.Scanner;
class KvadratnaEnacba{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double c = scan.nextDouble();
    if((b*b-4*a*c)<0){
      System.out.println("Kompleksna rešenja");
    }else{
      double korendiskriminante = Math.sqrt(b*b-4*a*c);
      double x1 = (-b+korendiskriminante)/2*a;
      double x2 = (-b-korendiskriminante)/2*a;
      System.out.println("x1 = "+x1);
      System.out.println("x2 = "+x2);
    }
  }
}
