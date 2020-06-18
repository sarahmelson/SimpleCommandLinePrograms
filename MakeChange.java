package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		System.out.println("Amount Of Bill");
		Scanner input = new Scanner(System.in);
		String strBillAmount = input.nextLine();
		double billAmount = Double.parseDouble(strBillAmount); 
		
		System.out.println("Amount Tendered");
		String strAmountTender = input.nextLine();
		double amountTender = Double.parseDouble(strAmountTender);
		
		Double change = amountTender - billAmount; 
		System.out.println("Your change is " + change);
		}

}
