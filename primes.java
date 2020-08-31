import java.util.*;
//Program prints the first prime numbers in the list of numbers in which the amount of numbers in the list 
//is inputed

public class primes
{
	public static void main (String args[]){
		
	Scanner input = new Scanner (System.in);
	int choice;
	int divisor;
	int numberprinted = 0;
	//the number that represents the amount of prime numbers
	int candidate = 1;
	//the number you look at to see if it is a prime number
	boolean isprime = true;
	
	System.out.printf ("How many primes? ");
	choice = input.nextInt();
	
	while (numberprinted <= choice )
	{
		isprime = true;
		for(divisor = 2; divisor <= candidate-1; divisor++)
		{
			if((candidate % divisor) == 0)
				isprime = false;
			//not prime
			//it is set to false, but it is never set back. so every number after is false.
			
		}
		if(isprime == true)
		{
			System.out.printf ("%d\n" , candidate);
			numberprinted++;
		}
		candidate++;
			
	}
	
	
	}
	}