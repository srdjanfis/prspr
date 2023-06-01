import java.util.Scanner;
public class SumOfOdds {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int n = input.nextInt();
        int sum = 0;
        int temp = 1;
        while (temp<=n) {
            sum += temp;
            temp = temp + 2;
        }
        System.out.println("The requested sum is: " + sum);
    }
}
