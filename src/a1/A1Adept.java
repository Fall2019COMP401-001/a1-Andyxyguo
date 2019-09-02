package a1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		Hashtable<String, Double> hash = new Hashtable<String, Double>();
		Hashtable<Double, String> hs = new Hashtable<Double, String>();
		ArrayList<Double> array = new ArrayList<Double>();
		for (int i = 0; i < count; i++) {
			String item_name = scan.next();
			double price = scan.nextDouble();
			hash.put(item_name, price);
		}
		


		int customers = scan.nextInt();
		for (int a = 0; a< customers; a++) {
			double total =0;
			String first_name = scan.next();
			String last_name = scan.next();
			int order = scan.nextInt();
			for (int h=0; h<order; h++ ) {
				double quantity = scan.nextDouble();
				String item_name = scan.next();
				total += quantity*hash.get(item_name);
			}
			array.add(total);
			hs.put(total, first_name +" "+last_name);
		};



		double max = findValueMax(array);
		System.out.println("Biggest: " + hs.get(max) + " (" + df.format(max) + ")");
		double min = findValueMin(array);
		System.out.println("Smallest: " + hs.get(min) + " (" + df.format(min) + ")");
		double average = calculateValueSum(array)/(array.size());
		System.out.println("Average: " + df.format(average));
	}

	static double calculateValueSum(ArrayList<Double> vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.size(); i++) {
			sum += vals.get(i);
		}
		
		return sum;
	}

	static double findValueMin(ArrayList<Double> vals) {
		
		double cur_min = vals.get(0);
		
		for (int i=1; i < vals.size(); i++) {
			if (vals.get(i) < cur_min) {
				cur_min = vals.get(i);
			}
		}
		
		return cur_min;
	}

	static double findValueMax(ArrayList<Double> vals) {
		
		double cur_max = vals.get(0);
		
		for (int i=1; i < vals.size(); i++) {
			if (vals.get(i) > cur_max) {
				cur_max = vals.get(i);
			}
		}
		
		return cur_max;
	}
}