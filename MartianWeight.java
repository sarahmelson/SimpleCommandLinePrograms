package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		System.out.println("How Many People Are Going to Mars");
		Scanner input = new Scanner(System.in);
		String strSpaceExplorers = input.nextLine();
		int spaceExplorers = Integer.parseInt(strSpaceExplorers); 
		
		int[] earthWeights = new int[spaceExplorers]; 
		for (int i=0; i<spaceExplorers; i++) {
			System.out.println("Enter Weight");
			String strSpaceWeight = input.nextLine();
			int spaceWeight = Integer.parseInt(strSpaceWeight); 
			earthWeights[i] = spaceWeight;
			
		}
		System.out.println("Earth Weights and Space Weights");
		for (int j=0; j<spaceExplorers; j++) {
			double marsWeight = (double)earthWeights[j] * 0.378; 
			System.out.format("Earth Weight: %-10s Mars Weight: %.0f \n", earthWeights[j], marsWeight);
	
		
		}

	}

}
