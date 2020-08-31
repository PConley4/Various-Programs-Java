import java.util.*;
import java.Random;

public class Bubble
{
	public static void main (String args[])
	{
		
	int size;
	int ray[];
	int i,j,temp;
	Random rand = new Random();
	
	if(args.length != 1)
	{
		System.out.printf ("Usage: java Bubble <n>\n");
		System.out.printf("\tn: Number of integer to sort\n");
		System.exit();
	}
	/*
	  System.out.printf("args: %d\n", args.length);
	  for (i=0; i<args.length; i++)
	  {
		  System.out,printf ("arg %d: %s\n", i, args[i]););
	  }
	  size = Integer.parseInt (args[0]);
	  
	  ray = new int[size];
	  for (int=0; i<args.length; i++)
		  ray[i] = rand.nextInt(5000000) + 1;

	for(i=0; i<ray.length; i++)
		System.out.printf ("%d", ray[i]);
		System.out.printf("\n");
	*/
	for(j=0; j<ray.length; j++){
		
	for(i=0; i<ray.length-1; i++){
	if(ray[i] > ray[i+1]){
		temp=ray[i];
		ray[i] = ray[i+1];
		ray[i+1] = temp;
		}
	}
}
	
	/*for(i=0; i<ray.length; i++){
		System.out.printf ("%d", ray[i]);
		System.out.printf("\n");
	}
	*/
}
}
