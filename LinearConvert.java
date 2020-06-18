package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		System.out.println("Please enter the length:");
		Scanner input = new Scanner(System.in);
		
		String strEnteredLength = input.nextLine();
		int enteredLength = Integer.parseInt(strEnteredLength);
		
		System.out.println("Is this length in feet or meters?\nPlease enter (F) for feet and (M) for meters");
		
		String strFeetOrMeters = input.nextLine();
		char feetOrMeters = strFeetOrMeters.charAt(0);
		
		double doubleFeetToMeters = (double)enteredLength * 0.3048; int feetToMeters = (int)doubleFeetToMeters;
		double doubleMetersToFeet = (double)enteredLength * 3.2808399; int metersToFeet = (int)doubleMetersToFeet;
		
		if (feetOrMeters == 'F') {
			System.out.println(enteredLength + " feet equals " + feetToMeters + " meters.");
		} else if (feetOrMeters == 'M') {
			System.out.println(enteredLength + " meters equals " + metersToFeet + " feet.");
		} else {
			System.out.println("You did not make a valid selection. Please try again :)");
		}

	}

}
