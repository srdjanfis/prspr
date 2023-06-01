import java.util.Scanner;
public class SumOfDigits {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        long n = input.nextLong();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
