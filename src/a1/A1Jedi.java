package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalNoItems = scan.nextInt();
		
		String[] itemList = new String[totalNoItems];
		double[] itemCost = new double[totalNoItems];
		int[] itemSold = new int[totalNoItems];
		int[] noCustomer = new int[totalNoItems];
		
		for(int i = 0; i < totalNoItems; i++) {
			itemList[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		int totalNoCus = scan.nextInt();
		
		String[] customerList = new String[totalNoCus];
		double[] customerCost = new double [totalNoCus];
		
		for (int j = 0; j < totalNoCus; j++) {
			customerList[j] = scan.next() + " " +scan.next();
			int noItem = scan.nextInt();
			for (int k =0; k<noItem; k++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				for (int a=0; a<totalNoItems; a++) {
					if (name.equals(itemList[a])) {
						itemSold[a] = itemSold[a] + quantity;
						noCustomer[a] ++;
					}
				}
		
			}
		}
		
		for (int b = 0; b < totalNoItems; b++) {
			if (noCustomer[b] == 0) { 
			System.out.println("No customers bought " + itemList[b]);
			} else {
				System.out.println(noCustomer[b] + " customers bought " + itemSold[b] +" " + itemList[b]);
			}
		}
	}
}


