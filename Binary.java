package snippet;

import java.util.Scanner;

//Converts the input of a string of characters to binary.

public class Binary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pika = "";	//This will contain the user input.
		String result = "";	//This will contain the converted string.
		
		System.out.println("Enter a sentence with letters.");
		pika = input.nextLine();
		
		//try catch here?
		
		char[] mander = pika.toCharArray();	//Converts a string, pika, into a character array, mander.
		
		for(int i = 0; i<mander.length; i++) {
			result += Integer.toBinaryString(mander[i]);	//returns a string made up of the binary form of the mander array.
		}
		
		System.out.println(result);
		}

	}
