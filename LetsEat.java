package test;

import java.util.Scanner;

public class LetsEat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Enter the amount of money you want to top-up: ");
		int money = input.nextInt();
		
		if(money != 0) {
			System.out.println("1. Black Coffee - 10 USD");
			System.out.println("2. Coffee Latte - 14 USD");
			System.out.println("3. Matcha Latte - 16 USD");
			System.out.println("4. Dolce Latte - 18 USD");
			System.out.print("What do you want to order: ");
			int choice = input.nextInt();
			
			while(choice!=1 && choice!=2 && choice!=3 && choice!=4) {
				System.out.println("wrong input, input again.");
				System.out.println("1. Black Coffee - 10 USD");
				System.out.println("2. Coffee Latte - 14 USD");
				System.out.println("3. Matcha Latte - 16 USD");
				System.out.println("4. Dolce Latte - 18 USD");
				System.out.print("What do you want to order: ");
				choice = input.nextInt();
			}
			
			if(choice==1 || choice==2 || choice==3 || choice==4) {
				if(choice == 1) {
					int left = money - 10;
					System.out.println("Thank you for ordering Black Coffee, price is $10, the balance of your money is now " + left);
					if(left >= 20) {
						System.out.print("Would you like to order again?");
					}
				}
				if(choice == 2) {
					int left = money - 14;
					System.out.println("Thank you for ordering Coffee Latte, price is $14, the balance of your money is now " + left);
					if(left >= 20) {
						System.out.print("Would you like to order again?");
					}
				}
				if(choice == 3) {
					int left = money - 16;
					System.out.println("Thank you for ordering Matcha Latte, price is $16, the balance of your money is now " + left);
					if(left >= 20) {
						System.out.print("Would you like to order again?");
					}
				}
				if(choice == 4) {
					int left = money - 18;
					System.out.println("Thank you for ordering Dolce Latte, price is $18, the balance of your money is now " + left);
					if(left >= 20) {
						System.out.print("Would you like to order again?");
					}
			}
			}
			
			
		}
		
		
		input.close();
	}

}
