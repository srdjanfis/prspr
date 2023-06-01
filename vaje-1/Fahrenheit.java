import java.util.Scanner;
class Fahrenheit {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double fahrenheit = scan.nextDouble();
      double celsius = (fahrenheit-32.0)/1.8;
      System.out.println("Celsius:"+celsius);
  }
}
