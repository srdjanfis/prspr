package fis.si;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        if(firstWord.length() == secondWord.length()){
            char[] firstCharArray = firstWord.toCharArray();
            char[] secondCharArray = secondWord.toCharArray();
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            String s1 = new String(firstCharArray);
            String s2 = new String(secondCharArray);
            if(s1.equals(s2)){
                System.out.println("Vnesene besede sta anagrami");
            } else{
                System.out.println("Vnesene besede nista anagrami.");
            }

        } else{
            System.out.println("Vnesene besede nista anagrami.");
        }
        scanner.close();
    }
}
