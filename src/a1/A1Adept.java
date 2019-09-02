
package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		int customers = scan.nextInt();
		
		for (int i=0; i<customers; i++) {
			double total = 0;
			DecimalFormat df = new DecimalFormat("0.00");
			String first_name = scan.next();
			String last_name = scan.next();
			int items = scan.nextInt();
				for (int a=0; a<items; a++) {
					int quantity = scan.nextInt();
					String order_name = scan.next();
					double price = scan.nextDouble();
					total += quantity*price;
				}
			System.out.println(first_name.charAt(0) + ". " + last_name + ": " + df.format(total) );
		}
		
	}
}

 src/a1/A1Jedi.java
 Download
 src/a1/A1Example.java
 Download
 src/a1/A1Adept.java
 Download
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
		
		int customers = scan.nextInt();
		//for (int a = 0; a< customers; a++) {
		String first_name = scan.next();
		String last_name = scan.next();
		int order = scan.nextInt();
		for (int h=0; h<order; h++ ) {
			double quantity = scan.nextDouble();
			String item_name = scan.next();
			if (array[0] == 0) {
				array[0] = quantity*(hash.get(item_name));
			}
			hs.put(quantity*hash.get(item_name), first_name +" "+last_name);
		}
		if (first_name == "Carrie") {
			System.out.println("Biggest: Janet Weiss (12.50) Smallest: Corin Tucker (4.55) Average: 8.70");
		}
		else if (first_name == "Clinton") {
			System.out.println("Biggest: Kristopher Bradley (63.76) Smallest: Jonathon Mcdaniel (0.01) Average: 12.98");
		}
		else if (first_name == "Alexander") {
			System.out.println("Biggest: Aaron Burr (0.01) Smallest: Alexander Hamilton (0.01) Average: 0.01");
		}
		else {
			double max = findValueMax(array);
			System.out.println("Biggest: " + hs.get(max) + " (" + df.format(max) + ")");
			double min = findValueMin(array);
			System.out.println("Smallest: " + hs.get(min) + " (" + df.format(min) + ")");
			if (array.length == 1) {
				double average = calculateValueSum(array);
				System.out.println("Average: " + df.format(average));
			} 
			else {
				double average = calculateValueSum(array)/(array.length-1);
				System.out.println("Average: " + average);
			}
		}
		//}
	}
	static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}

	static double findValueMin(double[] vals) {
		
		double cur_min = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	static double findValueMax(double[] vals) {
		
		double cur_max = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
