package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number.");
		Scanner input = new Scanner(System.in);
		
		String strEnteredInt = input.nextLine();
		int enteredInt = Integer.parseInt(strEnteredInt);
		
		int[] fibArray = new int[enteredInt];
		
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		for (int i = 2; i < enteredInt; i++) {
			if (enteredInt == 0) {
				System.out.print("0");
			} else if (enteredInt == 1) {
				System.out.print("0, 1");
			} else {
				fibArray[i] = fibArray[i-1] + fibArray[i-2];
			}
		}
		for (int i = 0; fibArray[i] <= enteredInt; i++) {
			System.out.print(fibArray[i] + " ");
		}

	}

}
