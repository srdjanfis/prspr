import java.util.Scanner;
 public class Array1 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Input a word: ");
	  String word = in.nextLine();
  	word = word.trim();
  	String result = "";
	  for (int i = word.length() - 1; i >= 0; i--) {
		  result += word.charAt(i);
	  }
  	System.out.println("Reversed word: "+result.trim());
	}
}
