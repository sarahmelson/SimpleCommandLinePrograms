package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println("Please numbers separated by spaces.");
		Scanner input = new Scanner(System.in);
		
		String strEnteredNumbers = input.nextLine();
		String [] arrEnteredNumbers = strEnteredNumbers.split(" ");
		
		int [] numEnteredNumbers = new int[arrEnteredNumbers.length];
		
		for (int i = 0; i < arrEnteredNumbers.length; i++) {
			numEnteredNumbers[i] = Integer.parseInt(arrEnteredNumbers[i]);
		}
		
		String [] binaryEnteredNumbers = new String[arrEnteredNumbers.length];
		
		for (int i = 0; i <numEnteredNumbers.length; i++) {
			binaryEnteredNumbers[i] = Integer.toBinaryString(numEnteredNumbers[i]);
			
		
		}
	
	for (int i = 0; i < binaryEnteredNumbers.length; i++) {
		System.out.println(numEnteredNumbers[i] + " in binary is " + binaryEnteredNumbers[i]);
	}

	}

}
