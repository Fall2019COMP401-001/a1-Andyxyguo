package a1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Hashtable;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		for (int i = 0; i < count; i++) {
			String item_name = scan.next();
			double price = scan.nextDouble();
			hash.put(item_name, 0);
		}
		
		int customers = scan.nextInt();
		for (int a = 0; a< customers; a++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int order = scan.nextInt();
			for (int h=0; h<order; h++ ) {
				double quantity = scan.nextDouble();
				String item_name = scan.next();
				hash.put(item_name, hash.get(item_name)+1);
			}
		}
		System.out.println(hash);
	}
}
