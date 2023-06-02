import java.util.Scanner;
public class DaysInMonth {
  public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0;
        System.out.println("Input a month number: ");
        int month = input.nextInt();
        System.out.println("Input a year: ");
        int year = input.nextInt();
        if((month == 1) ||
           (month == 3) ||
           (month == 5) ||
           (month == 7) ||
           (month == 8) ||
           (month == 10) ||
           (month == 12)) {
            number_Of_DaysInMonth = 31;
           }else if((month == 4) ||
           (month == 6) ||
           (month == 9) ||
           (month == 11)){
             number_Of_DaysInMonth = 30;
           }else{
             if ((year % 400 == 0) ||
                 ((year % 4 == 0) && (year % 100 != 0))) {
                number_Of_DaysInMonth = 29;
             } else {
                number_Of_DaysInMonth = 28;
             }
           }
        System.out.print(number_Of_DaysInMonth);
    }
}
