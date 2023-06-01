import java.util.Scanner;
 public class For2 { 
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Input an integer: ");
      int x = in.nextInt();
      int ctr = 0;
      for(int i=1; i<=x; i++) {
        if(x%i==0) {
          System.out.println(i);
        }
      }
	}
}
