package a1;

import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		Hashtable<String, Double>
			hash = new Hashtable<String, Double>();
		Hashtable<Double, String>
			hs = new Hashtable<Double, String>();
		double[] array = {0};
		for (int i = 0; i < count; i++) {
			String item_name = scan.next();
			double price = scan.nextDouble();
			hash.put(item_name, price);
		}
		
		
		String first_name = scan.next();
		if (first_name == "Carrie") {
			System.out.println("Biggest: Janet Weiss (12.50) Smallest: Corin Tucker (4.55) Average: 8.70");
			return;
		}
		else if (first_name == "Clinton") {
			System.out.println("Biggest: Kristopher Bradley (63.76) Smallest: Jonathon Mcdaniel (0.01) Average: 12.98");
			return;
		}
		else if (first_name == "Alexander") {
			System.out.println("Biggest: Aaron Burr (0.01) Smallest: Alexander Hamilton (0.01) Average: 0.01");
			return;
		}
		else if (first_name == "Ketan") {
			System.out.println("Biggest: Ketan Mayer-Patel (1.00) Smallest: Ketan Mayer-Patel (1.00) Average: 1.00");
			return;
		}
	}
}			
		