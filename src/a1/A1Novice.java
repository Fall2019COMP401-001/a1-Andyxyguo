package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		int customers = scan.nextInt();
		scan.nextLine();
		
		for (int i=0; i<customers; i++) {
			double total = 0;
			DecimalFormat df = new DecimalFormat("#.00");
			String first_name = scan.next();
			String last_name = scan.next();
			int items = scan.nextInt();
				for (int a=0; a<items; a++) {
					int quantity = scan.nextInt();
					scan.nextLine();
					String order_name = scan.next();
					double price = scan.nextInt();
					scan.nextLine();
					total += quantity*price;
				}
			System.out.println(first_name.charAt(0) + ". " + last_name + ": " + df.format(total) );
		}
		
	}
}
