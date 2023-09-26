package test;

import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birthyear: ");
		int byear = input.nextInt();
		
		if(byear%2==0) {
			if(byear%12==0) {
				System.out.println("Even year with zodiac monkey.");
			}
			if(byear%12==2) {
				System.out.println("Even year with zodiac dog.");
			}
			if(byear%12==4) {
				System.out.println("Even year with zodiac rat.");
			}
			if(byear%12==6) {
				System.out.println("Even year with zodiac tiger.");
			}
			if(byear%12==8) {
				System.out.println("Even year with zodiac dragon.");
			}
			if(byear%12==10) {
				System.out.println("Even year with zodiac horse.");
			}
			
		}
		else{
			if(byear%12==1) {
				System.out.print("Odd year with zodiac rooster.");
			}
			if(byear%12==3) {
				System.out.print("Odd year with zodiac pig.");
			}
			if(byear%12==5) {
				System.out.print("Odd year with zodiac ox.");
			}
			if(byear%12==7) {
				System.out.print("Odd year with zodiac rabbit.");
			}
			if(byear%12==9) {
				System.out.print("Odd year with zodiac snake.");
			}
			if(byear%12==11) {
				System.out.print("Odd year with zodiac sheep.");
			}
		}
		
	input.close();
	}
}
