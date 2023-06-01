import java.util.Scanner;
 public class For1 {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int p = scan.nextInt();
		int res = 0;
		for(int i=x;i<=y;i++){
		  if(i%p==0){
		    res++;
		  }
		}
		System.out.println(res);
	 }
 }
