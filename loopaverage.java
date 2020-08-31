/*
	Conley, CS 161, Program 1
*/
import java.util.*;

public class loopaverage
{
	public static void main (String Args[]){
	int input=-1;//make the while loop true
	int total=0; 
	Scanner myscanner = new Scanner (System.in);
	double entries=0;
	double average;
	
	//loop until user enters 0+
	while(input != 0) {
		System.out.printf ("Enter a number (0 to exit): ");
		input = myscanner.nextInt();
		total=total + input;
		/*prevent "entries++" from happening when the user entry is zero
		if (input != 0){
		entries++;
		}
		*/
	}
		entries = entries--; //OR entries-1 because entries are always off by one
		System.out.printf ("Total: %d\n", total);
		System.out.printf ("Total: %f\n", entries);
		//-1 prevents the "entries++" when the user enters zero.
		//=total/entries-1;
		if(entries == 0){
			System.out.printf("Cannot divide by ZeRo.\n");
		}
		else{
		average=total/entries;
		System.out.printf ("Average: %f\n", average);
	}
}
}
