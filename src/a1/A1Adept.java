package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalNoItems = scan.nextInt();
		
		String[] itemList = new String[totalNoItems];
		double[] itemCost = new double[totalNoItems];
		
		for(int i = 0; i < totalNoItems; i++) {
			itemList[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		int totalNoCus = scan.nextInt();
		
		
		String[] customerList = new String[totalNoCus];
		// String[] firstName = new String[totalNoCus];
		// String[] lastName = new String[totalNoCus];
		double[] customerCost = new double [totalNoCus];
		
		for (int j = 0; j < totalNoCus; j++) {
			customerList[j] = scan.next() + " " +scan.next();
			// firstName[j] = scan.next();
			// lastName[j] = scan.next();
			int noItem = scan.nextInt();
			double totalPrice = 0.0;
			for (int a=0; a<noItem; a++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				for (int k=0; k<totalNoItems; k++) {
					if (name.equals(itemList[k])) {
						totalPrice = totalPrice + quantity * itemCost[k];
					}
				}
			}
		customerCost[j] = totalPrice;
			
		}
		


		
		
		// BIGGEST
		double bigPrice = 0;
		int bigNo = 0;
		for (int b=0; b<totalNoCus; b++) {
			if(customerCost[b] > bigPrice) {
				bigPrice = customerCost[b];
				bigNo = b;
			}
		}
		
		// Smallest
		double smallPrice = 1000000000.00;
		int smallNo = 0;
		for (int c=0; c<totalNoCus; c++) {
			if(customerCost[c] < smallPrice) {
				smallPrice = customerCost[c];
				smallNo = c;
			}
		}
		
		//average
		double sum = 0.0;
		for (int z=0; z<totalNoCus; z++) {
			sum = sum + customerCost[z];
		}
		double average = sum / totalNoCus;
		
		System.out.println("Biggest: " + customerList[bigNo] + " (" + String.format("%.2f",bigPrice) + ")"  );
		System.out.println("Smallest: " + customerList[smallNo] + " (" + String.format("%.2f",smallPrice) + ")"  );
		System.out.println("Average: " + String.format("%.2f",average));
	}
}

