package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting number? ");
		//get the next int
		int n = in.nextInt();
		//make an array
		int [] primeCheck = new int[n];
		
		//create a for loop to run through primeCheck
		
		for (int i = 0; i<= primeCheck.length - 1; i++) {
			primeCheck[i]=i; 
			
			System.out.println(primeCheck[i]);
			
			
			
			
			
		}
		
	


		
		
		
	}

	
}



