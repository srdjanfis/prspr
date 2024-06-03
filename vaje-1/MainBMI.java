package prspr;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vnesite višino v centimetrih: ");
		double cm = sc.nextDouble();
		System.out.print("Vnesite težo v kilogramih: ");
		double kg = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("Vaš BMI je: " + 
				df.format(kg/(cm*cm/10000)));
		sc.close();
	}

}
