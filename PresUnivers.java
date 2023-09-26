package test;

import java.util.Scanner;

public class PresUnivers {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Are you a presunivers? (enter 1 if yes and 0 if no)");
		int ans1 = input.nextInt();
		
		while(ans1 != 1 && ans1 !=0) {
			System.out.print("Invaild option. Please enter a valid number: ");
			ans1 = input.nextInt();
			
		}
		if(ans1 == 1) {
		System.out.println("Which faculty are you in?");
		System.out.println("1. Faculty of Computing.");
		System.out.println("2. Faculty of Engineering.");
		System.out.println("3. Faculty of Business.");
		System.out.println("4. Faculty of Humanities.");
		System.out.println("5. Faculty of Medicine.");
		System.out.print("Please enter an option from 1-5: ");
		int facopt = input.nextInt();
		
		while(facopt !=1 && facopt !=2 && facopt!=3 && facopt!=4 && facopt!=5) {
			System.out.print("Invalid option.");
			System.out.println("Which faculty are you in?");
			System.out.println("1. Faculty of Computing.");
			System.out.println("2. Faculty of Engineering.");
			System.out.println("3. Faculty of Business.");
			System.out.println("4. Faculty of Humanities.");
			System.out.println("5. Faculty of Medicine.");
			System.out.print("Please enter a valid number: ");
			facopt = input.nextInt();
			
			}
		if(facopt == 1) {
			System.out.println("Hello, presunivers! You are in faculty of Computing");
		}
		else if(facopt == 2) {
			System.out.println("Hello, presunivers! You are in faculty of Engineering.");
		}
		else if(facopt == 3) {
			System.out.println("Hello, presunivers! You are in faculty of Business.");
		}
		else if(facopt == 4) {
			System.out.println("Hello, presunivers! You are in faculty of Humanities.");
		}
		else if(facopt == 5) {
			System.out.println("Hello, presunivers! You are in faculty of Medicine.");
		}
		}
		else
			System.out.println("You are not a presunivers.");
		
		input.close();
	}

}
