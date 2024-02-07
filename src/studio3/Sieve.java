package studio3;

import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("provide n");
		int n = in.nextInt();
		int isPrime = 1;
		int [] divisors = new int [(n/2)+1];

		int index = 0;
		int indexForPrimeTest = 0;
		while (index <= n/2) {

			divisors [index] = index++;

		}
		for (int x = 0 ; x <= n ; x++) {
			if(x % divisors [indexForPrimeTest+1]== 0)
				{isPrime=0;
			indexForPrimeTest++;
			System.out.println("The number " +x+ " is prime!");
				}
			
		}

		{
			indexForPrimeTest++;
		}
		System.out.println("Done!");

		{




		}

	}
}
