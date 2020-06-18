package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		System.out.println("Please enter the temperature:");
		
		Scanner input = new Scanner(System.in);
		
		String strEnteredTemp = input.nextLine();
		int enteredTemp = Integer.parseInt(strEnteredTemp);
		
		System.out.println("Is this temperature celsius or fahrenheit?\nPlease enter (C) for celsius and (F) for fahrenheit.");
		
		String strCelsOrFahr = input.nextLine();
		char celsOrFahr = strCelsOrFahr.charAt(0);
		
		double fahrToCels = (((double)enteredTemp - 32) / 1.8); int intFahrToCels = (int)fahrToCels;
		double celsToFahr = ((double)enteredTemp * 1.8 + 32); int intCelsToFahr = (int)celsToFahr;
		
		if (celsOrFahr == 'C') {
			System.out.println(enteredTemp + "C is " + intCelsToFahr + "F.");
		} else if (celsOrFahr == 'F') {
			System.out.println(enteredTemp + "F is " + intFahrToCels + "C.");
		} else {
			System.out.println("You did not make a valid selection. Please try again :)");
		}
		
	}

}
