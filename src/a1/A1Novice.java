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
			DecimalFormat df = new DecimalFormat("#.00");
			String first_name = scan.nextLine();
			String last_name = scan.nextLine();
			int items = scan.nextInt();
				for (int a=0; a<items; a++) {
					int quantity = scan.nextInt();
					String order_name = scan.nextLine();
					double price = scan.nextInt();
					total += quantity*price;
				}
			System.out.println(first_name.charAt(0) + ". " + last_name + ": " + df.format(total) );
		}
		
	}
}
