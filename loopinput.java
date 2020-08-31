/*
	Conley, CS 161, Program 1
*/
import java.util.*;

public class loopinput
{
	public static void main (String Args[]){
	int i=2;
	int input=-1;//make the while loop true
	Scanner myscanner = new Scanner (System.in);
	
	while(input <= 0) {
	System.out.printf ("Enter a number greater than 0: ");
	input = myscanner.nextInt();	
	}
		System.out.printf ("Valid entry\n");
	}
}
