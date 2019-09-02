package a1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		Hashtable<String, Integer> hs = new Hashtable<String, Integer>();
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			String item_name = scan.next();
			double price = scan.nextDouble();
			al.add(item_name);
			hash.put(item_name, 0);
			hs.put(item_name, 0);
		}
		
		int customers = scan.nextInt();
		for (int a = 0; a< customers; a++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int order = scan.nextInt();
			ArrayList<String> ar = new ArrayList<String>();
			for (int h=0; h<order; h++ ) {
				int quantity = scan.nextInt();
				String item_name = scan.next();
				ar.add(item_name);
				hash.put(item_name, hash.get(item_name)+1);
				for (int i =0; i<ar.size(); i++) {
					if (item_name == ar.get(i)) {
						hash.put(item_name, 1);
					}
				}
				hs.put(item_name, hs.get(item_name)+quantity);
				System.out.println("------------------");
				System.out.println(item_name);
				System.out.println("------------------");
				System.out.println(hash.get(item_name));
				System.out.println("------------------");
				System.out.println(hs.get(item_name));
			}
		}

		for (int i = 0; i < hash.size(); i++) {
			if (hash.get(al.get(i)) == 0) {
				System.out.println("No customers bought " + al.get(i));
			}	
			else {
				System.out.println(hash.get(al.get(i)) + "customers bought " + hs.get(al.get(i)) + al.get(i));
			}
		}
	}
}
