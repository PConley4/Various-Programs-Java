/*
	Conley, CS 161, Program find the least expensive tutor(s)
*/
import java.util.*;
import java.util.Random;

public class lottery
{
	public static void main (String args[])
	{
	int matches;
	//number of matches
	int usernum[] = new int[6];
	int winningnum[] = new int[6];
	Random random = new Random();
	int i; 
	int w=0;
	int r=0;
	int check;
	int j;
	int t;
	int moneywon=0;
	int moneylost=0;
	int target=0;
	boolean same;
	int numrounds;
	Scanner rounds = new Scanner (System.in);
	
	System.out.printf("How many rounds do you want to play?:\n");
	numrounds = rounds.nextInt();
	usernum[0] = random.nextInt(54) + 1;
	usernum[1] = random.nextInt(54) + 1;
	usernum[2] = random.nextInt(54) + 1;
	usernum[3] = random.nextInt(54) + 1;
	usernum[4] = random.nextInt(54) + 1;
	usernum[5] = random.nextInt(54) + 1;
	for (i=0; i<usernum.length; i++){
		//checking to see if the user's lottery ticket has two of the same numbers and changing duplicates
		check = i-1;
		same = true;
		while ( same == true)
		{
			same = false;
		r=random.nextInt(54)+1;
		//We need to check to see if r == usernum[j] (already in array)
		
		for (j = 0; j <= check; j++){
			if (r == usernum[j])
				same = true; 
			//if same is false at end of loop, the number is not the same as any other in the array
		}
	}
		usernum[i] = r;
	}
	System.out.printf("%d,%d,%d,%d,%d,%d are your numbers. Good luck!\n\n", usernum[0], usernum[1], usernum[2], usernum[3], usernum[4], usernum[5]);
	
	while (numrounds != 0){
	w++; 
	System.out.printf ("Round %d: \n", w);
	//0 is the same everytime. how do I make the program roll zero?
	matches=0;
	winningnum[0] = random.nextInt(54) + 1;
	winningnum[1] = random.nextInt(54) + 1;
	winningnum[2] = random.nextInt(54) + 1;
	winningnum[3] = random.nextInt(54) + 1;
	winningnum[4] = random.nextInt(54) + 1;
	winningnum[5] = random.nextInt(54) + 1;
	//We want to assign a value to the winning numbers
	moneylost= moneylost + 1;
	//the money you paid for the lottery ticket
	numrounds= numrounds -1;
	
	for (i=0; i<winningnum.length; i++){
		//checking to see if the lottery has two of the same numbers and changing duplicates
		check = i-1;
		same = true;
		while ( same == true)
		{
			same = false;
		r=random.nextInt(54)+1;
		
		//We need to check to see if r == winningnum[j] (already in array)
		for (j = 0; j <= check; j++){
			if (r == winningnum[j])
				same = true; 
			//if same is false at end of loop, the number is not the same as any other in the array
		}
	}
		winningnum[i] = r;
	}
	
	System.out.printf("%d,%d,%d,%d,%d,%d are the winning numbers! \n", winningnum[0], winningnum[1], winningnum[2], winningnum[3], winningnum[4], winningnum[5]);
	
	for (t=0; t<usernum.length; t++){
	target = usernum[t];
			for (j = 0; j < winningnum.length; j++){
				if (target==winningnum[j]){
					matches=matches+1;
				//checking for a matching number
				}
			}	
			}
			
		if(matches==6){
		System.out.printf("Wow! You have a perfect match of all six numbers! You won the jackpot!!!!!! That's $20,000,000!!!!!!\n\n");
		moneywon = moneywon + 20000000;
		}
		if(matches==5){
		System.out.printf("You matched 5 numbers! That's $2,000!\n\n");
		moneywon = moneywon + 2000;
		}
		if(matches==4){
		System.out.printf("4 numbers matched. That means you've won $50!\n\n");
		moneywon = moneywon + 50;
		}
		if(matches==3){
		System.out.printf("3 numbers matched. You've only won $3...\n\n");
		moneywon = moneywon + 3;
		}
		if(matches==2){
		System.out.printf("Sadly, 2 matching numbers doesn't get you anything here...\n\n");
		}
		if(matches==1){
		System.out.printf("One match just isn't enough.\n\n");
		}
		if(matches==0){
		System.out.printf("Nope, none of your numbers match.\n\n");
		}
		}
		
	
	System.out.printf ("The total money you made was %d. The total money you used was %d\n.", moneywon, moneylost);
	}
}
/*	for (i=0; i<usernum.length; i++)
	target = user.number[i];
			for (j = 0; j < winningnumber.length; j++)
			{
				if (target==winningnumber[j])
				{
					matches=matches+1;
				}
			}
		}
		//checking for a matching number
		*/
		/*switch(matches)
		case 1:
		moneywon = moneywon + 3
		break:
		a:
		b:
		*/

