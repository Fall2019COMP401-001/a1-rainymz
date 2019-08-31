package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalCus = scan.nextInt();
		
		for (int i=0; i<totalCus; i++) {
			
			String firstName = scan.next();

			String lastName = scan.next();
			
			double totalPrice = 0.0;
			
			int totalItem = scan.nextInt();
			
			for (int j=0; j < totalItem; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				totalPrice = totalPrice + quantity * price;
				
			}
			
			String finalPrice = String.format("%.2f", totalPrice);
			System.out.println(firstName.charAt(0) + ". "+ lastName + ": " + finalPrice);
					
		}
		
		
		
	}
}

		