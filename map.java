import java.util.*;
import java.util.Random;
import java.io.*;

public class map{

	public map(){
	
	}

	public static void main (String args[]){
		Scanner movex = new Scanner (System.in);
		Scanner movey = new Scanner (System.in);
		Random random = new Random();
		int k;
		int done=0;
		int celltaken = 0;
		int celltaken2 = 0;
		int celltaken3 = 0;
		cell dungeon[][] = new cell[4][4];
		int	i, j;
		int	choice;
		int sure;
		File	fileoutput = null;
		File	fileinput = null;
		PrintWriter writer;
		Scanner	reader;
		Scanner keyin = new Scanner (System.in);
		boolean value[] = new boolean[10];
		
			
		int pitx = random.nextInt(4);
		int pity = random.nextInt(4);
		
		int pitx2 = random.nextInt(4);
		int pity2 = random.nextInt(4);
		
		int pitx3 = random.nextInt(4);
		int pity3 = random.nextInt(4);
		
		int wumpusx= random.nextInt(4);
		int wumpusy= random.nextInt(4);
		int goldx= random.nextInt(4);
		int goldy= random.nextInt(4);


		int cellx = 0;
		int celly = 0;
		System.out.print ("0 for new game, 1 to load,: ");
		choice = keyin.nextInt();
		
		if (choice == 0)
		{
		for(k=0; k < 4; k++){
			dungeon[0][k] = new cell(false,false,false,false,false,false,false,false,false,false);
		}
		for(k=0; k < 4; k++){
			dungeon[1][k] = new cell(false,false,false,false,false,false,false,false,false,false);
		}
		for(k=0; k < 4; k++){
			dungeon[2][k] = new cell(false,false,false,false,false,false,false,false,false,false);
		}
		for(k=0; k < 4; k++){
			dungeon[3][k] = new cell(false,false,false,false,false,false,false,false,false,false);
		}
			//for (i=0; i<3; i++)
			//	dungeon[i].print();
			
			System.out.println ("Hello there! Welcome to the world of Wumpus!");
			
			try
			{
				fileoutput = new File ("game.sav");
				writer = new PrintWriter(fileoutput);
				for (i=0; i<4; i++)
				{
				writer.println (dungeon[i][0].addbreeze());
					writer.println (dungeon[i][0].addbreeze2());
					writer.println (dungeon[i][0].addbreeze3());
					writer.println (dungeon[i][0].addsmell());
					writer.println (dungeon[i][0].addglimmer());
					writer.println (dungeon[i][0].addpit());
					writer.println (dungeon[i][0].addpit2());
					writer.println (dungeon[i][0].addpit3());
					writer.println (dungeon[i][0].addwumpus());
					writer.println (dungeon[i][0].addglimmer());
					
				}
				
				for (i=0; i<4; i++)
				{
					writer.println (dungeon[i][1].addbreeze());
					writer.println (dungeon[i][1].addbreeze2());
					writer.println (dungeon[i][1].addbreeze3());
					writer.println (dungeon[i][1].addsmell());
					writer.println (dungeon[i][1].addglimmer());
					writer.println (dungeon[i][1].addpit());
					writer.println (dungeon[i][1].addpit2());
					writer.println (dungeon[i][1].addpit3());
					writer.println (dungeon[i][1].addwumpus());
					writer.println (dungeon[i][1].addglimmer());
					
				}
				
				for (i=0; i<4; i++)
				{
					writer.println (dungeon[i][2].addbreeze());
					writer.println (dungeon[i][2].addbreeze2());
					writer.println (dungeon[i][2].addbreeze3());
					writer.println (dungeon[i][2].addsmell());
					writer.println (dungeon[i][2].addglimmer());
					writer.println (dungeon[i][2].addpit());
					writer.println (dungeon[i][2].addpit2());
					writer.println (dungeon[i][2].addpit3());
					writer.println (dungeon[i][2].addwumpus());
					writer.println (dungeon[i][2].addglimmer());
					
				}
				
				for (i=0; i<4; i++)
				{
					writer.println (dungeon[i][3].addbreeze());
					writer.println (dungeon[i][3].addbreeze2());
					writer.println (dungeon[i][3].addbreeze3());
					writer.println (dungeon[i][3].addsmell());
					writer.println (dungeon[i][3].addglimmer());
					writer.println (dungeon[i][3].addpit());
					writer.println (dungeon[i][3].addpit2());
					writer.println (dungeon[i][3].addpit3());
					writer.println (dungeon[i][3].addwumpus());
					writer.println (dungeon[i][3].addglimmer());
					
				}
					writer.println (pitx);
					writer.println (pity);
					writer.println (pitx2);
					writer.println (pity2);
					writer.println (pitx3);
					writer.println (pity3);
					writer.println (wumpusx);
					writer.println (wumpusy);
					writer.println (goldx);
					writer.println (goldy);
				writer.close();
			}
			catch (FileNotFoundException e)
			{
				System.out.println ("HALP.");
			}
		
		}
		if (choice == 1)
		{


			System.out.println ("Loading...");
			
			try
			{
				fileoutput = new File("game.sav");
				reader = new Scanner(fileoutput);
				
				
				for (j=0; j<4; j++)
				{
					for (i=0; i<10; i++)
						value[i] = reader.nextBoolean();
					dungeon[j][0] = new cell(value[0], value[1], value[2],
						value[3], value[4], value[5], value[6], value[7], value[8],
						value[9]);
					dungeon[j][0].print();
				}
				
				for (j=0; j<4; j++)
				{
					for (i=0; i<10; i++)
						value[i] = reader.nextBoolean();
					dungeon[j][1] = new cell(value[0], value[1], value[2],
						value[3], value[4], value[5], value[6], value[7], value[8],
						value[9]);
					dungeon[j][1].print();
				}
				
				for (j=0; j<4; j++)
				{
					for (i=0; i<10; i++)
						value[i] = reader.nextBoolean();
					dungeon[j][2] = new cell(value[0], value[1], value[2],
						value[3], value[4], value[5], value[6], value[7], value[8],
						value[9]);
					dungeon[j][2].print();
				}
				
				for (j=0; j<4; j++)
				{
					for (i=0; i<10; i++)
						value[i] = reader.nextBoolean();
					dungeon[j][3] = new cell(value[0], value[1], value[2],
						value[3], value[4], value[5], value[6], value[7], value[8],
						value[9]);
					dungeon[j][3].print();
				}
				System.out.println ("These are where the objects were.");
				System.out.println ("pitx: "+ pitx + " pity: " + pity + "		pitx2: "+ pitx2 + " pity2: " + pity2 + "	pitx3: "+ pitx3 + " pity3: " + pity3 +
				"	 goldx: "+ goldx + " goldy: " + goldy + "	 wumpusx: "+ wumpusx + " wumpusy: " + wumpusy);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		
		
		}
	
		


		
		
		//changing the booleans to true if the cell is valid (which it should be) and repositioning if the cell is already "taken"
		dungeon[wumpusx][wumpusy].addwumpus();
		
		dungeon[goldx][goldy].addgold();
		while(goldx == wumpusx && goldy == wumpusy)
		{
			goldx = random.nextInt(4);
			goldy = random.nextInt(4);
		}

		dungeon[pitx][pity].addpit();
		while((pitx == wumpusx) && (pity == wumpusy))
		{
			pitx = random.nextInt(4);
			pity = random.nextInt(4);
		}
		
		while((pitx == goldx) && (pity == goldy))
		{
			pitx = random.nextInt(4);
			pity = random.nextInt(4);
		}
	
		dungeon[pitx2][pity2].addpit2();
		while((pitx2 == wumpusx) && (pity2 == wumpusy))
		{
			pitx2 = random.nextInt(4);
			pity2 = random.nextInt(4);
		}
		
		while((pitx2 == goldx) && (pity2 == goldy))
		{
			pitx2 = random.nextInt(4);
			pity2 = random.nextInt(4);
		}
		
		while((pitx2 == pitx) && (pity2 == pity))
		{
			pitx2 = random.nextInt(4);
			pity2 = random.nextInt(4);
		}
	
		dungeon[pitx3][pity3].addpit3();
		while((pitx3 == wumpusx) && (pity3 == wumpusy))
		{
			pitx3 = random.nextInt(4);
			pity3 = random.nextInt(4);
		}
		
		while((pitx3 == goldx) && (pity3 == goldy))
		{
			pitx3 = random.nextInt(4);
			pity3 = random.nextInt(4);
		}
		
		while((pitx3 == pitx) && (pity3 == pity))
		{
			pitx3 = random.nextInt(4);
			pity3 = random.nextInt(4);
		}
		while((pitx3 == pitx2) && (pity3 == pity2))
		{
			pitx3 = random.nextInt(4);
			pity3 = random.nextInt(4);
		}
		
		
		
		while(done == 0){
		celltaken = 0;
		celltaken2 = 0;
		celltaken3 = 0;
		//after the dungeon is made
		//changes the user's location
		System.out.println("Where would you like go? Choose any number from 1-4 for the x-axis,and any number from 1-4 for the y-axis.");
		System.out.println ("pitx: "+ pitx + " pity: " + pity + "		pitx2: "+ pitx2 + " pity2: " + pity2 + "	pitx3: "+ pitx3 + " pity3: " + pity3 +  "	 goldx: "+ goldx + " goldy: " + goldy + "	 wumpusx: "+ wumpusx + " wumpusy: " + wumpusy);
		cellx = movex.nextInt();
	
		switch (cellx) {
			case 1: cellx = 1;
			cellx = 0;
			break;
			case 2: cellx = 2;
			cellx = 1;
			break;
			case 3: cellx = 3;
			cellx = 2;
			break;
			case 4: cellx = 4;
			cellx = 3;
			break;
			default: 
			//what if they choose an invalid location?
			System.out.println("Please chose a number from 1-4.");
			cellx = movex.nextInt();
		}
		
		celly = movey.nextInt();
		switch (celly) {
			case 1: celly = 1;
			//move them here
			celly = 0;
			break;
			case 2: celly = 2;
			//move them here
			celly = 1;
			break;
			case 3: celly = 3;
			//move them here
			celly = 2;
			break;
			case 4: celly = 4;
			//move them here
			celly = 3;
			break;
			default:
			//what if they choose an invalid location?
			System.out.println("Please chose a number from 1-4.");
			celly = movey.nextInt();
		}
		
		
		//what is displayed after a location is chosen
		if (dungeon[cellx][celly] == dungeon[pitx][pity]){
			
		System.out.println("You fell into the pit for what felt like hours... Game Over!");
		done= done +1;
		System.exit(0);
		}
		
		if (dungeon[cellx][celly] == dungeon[pitx2][pity2]){
		System.out.println("You fell into the pit for what felt like hours... Game Over!");
		System.exit(0);
		}
		
		if (dungeon[cellx][celly] == dungeon[pitx3][pity3]){
		System.out.println("You fell into the pit for what felt like hours... Game Over!");
		System.exit(0);
		}
		
		if (dungeon[cellx][celly] == dungeon[goldx][goldy]){
		System.out.println("You found the gold! Congratulations, you win!");
		System.exit(0);
		}
		
		if (dungeon[cellx][celly] == dungeon[wumpusx][wumpusy]){
		System.out.println("Oh no, its the Wumpus! And you have nothing to defend yourself with... That means you lose...");
		System.exit(0);
		}
				
		//if the space already has a breeze message or not
		if((celltaken2 == 0) && (celltaken3 == 0)){
			
			if(pitx+1 > 4){
		if (dungeon[cellx][celly] == dungeon[pitx+1][pity]){
			dungeon[cellx][celly].addbreeze();
		System.out.println("Something's stirring...");
		celltaken= celltaken + 1;
		 
		}
		}
	
			if (pitx-1 > 0){
		if (dungeon[cellx][celly] == dungeon[pitx-1][pity]){
			dungeon[cellx][celly].addbreeze();
		System.out.println("Something's stirring...");
		celltaken= celltaken + 1;
		 
		}
			}
				
			if (pity+1 < 4){
		if (dungeon[cellx][celly] == dungeon[pitx][pity+1]){
			dungeon[cellx][celly].addbreeze();
		System.out.println("Something's stirring...");
		celltaken= celltaken + 1;
		 
		}
			}
				
			if(pity-1 > 0){
		if (dungeon[cellx][celly] == dungeon[pitx][pity-1]){
			dungeon[cellx][celly].addbreeze();
		System.out.println("Something's stirring...");
		celltaken= celltaken + 1;
		 
		}
		}
		}
		
		
		if((celltaken == 0) && (celltaken3 == 0)){
			
			if(pitx2+1 > 4){
		if (dungeon[cellx][celly] == dungeon[pitx2+1][pity2]){
			dungeon[cellx][celly].addbreeze2();
		System.out.println("Something's stirring...");
		celltaken2= celltaken2 + 1;
		 
		}
			}

			if (pitx2-1 > 0){
		if (dungeon[cellx][celly] == dungeon[pitx2-1][pity2]){
			dungeon[cellx][celly].addbreeze2();
		System.out.println("Something's stirring...");
		celltaken2= celltaken2 + 1;
		 
		}
			}
		
		if (pity2+1 < 4){
		if (dungeon[cellx][celly] == dungeon[pitx2][pity2+1]){
			dungeon[cellx][celly].addbreeze2();
		System.out.println("Something's stirring...");
		celltaken2= celltaken2 + 1;
		 
		}
		}
		
		if(pity2-1 > 0){
		if (dungeon[cellx][celly] == dungeon[pitx2][pity2-1]){
			dungeon[cellx][celly].addbreeze2();
		System.out.println("Something's stirring...");
		celltaken2= celltaken2 + 1;
		 
		}
		}
		}
		if((celltaken == 0) && (celltaken2 == 0)){
			
			if(pitx3+1 > 4){
		if (dungeon[cellx][celly] == dungeon[pitx3+1][pity3]){
			dungeon[cellx][celly].addbreeze3();
		System.out.println("Something's stirring...");
		celltaken3 = celltaken3 + 1;
		 
		}
			}

		if (pitx3-1 > 0){
		if (dungeon[cellx][celly] == dungeon[pitx3-1][pity3]){
			dungeon[cellx][celly].addbreeze3();
		System.out.println("Something's stirring...");
		celltaken3 = celltaken3 + 1;
		 
		}
		}
		
		if (pity3+1 < 4){
		if (dungeon[cellx][celly] == dungeon[pitx3][pity3+1]){
			dungeon[cellx][celly].addbreeze3();
		System.out.println("Something's stirring...");
		celltaken3 = celltaken3 + 1;
		 
		}
		}
		
		if(pity3-1 > 0){
		if (dungeon[cellx][celly] == dungeon[pitx3][pity3-1]){
			dungeon[cellx][celly].addbreeze3();
		System.out.println("Something's stirring...");
		celltaken3 = celltaken3 + 1;
		 
		}
		}
		}
		
		if(goldx+1 < 4){
		if (dungeon[cellx][celly] == dungeon[goldx+1][goldy]){
		System.out.println("There's something glimmering in the distance. Could it be...?");
		 
		}
		}
		
		if(goldx-1 > 0){
		if (dungeon[cellx][celly] == dungeon[goldx-1][goldy]){
		System.out.println("There's something glimmering in the distance. Could it be...?");
		 
		}
		}
		
		if(goldy+1 < 4){
		if (dungeon[cellx][celly] == dungeon[goldx][goldy+1]){
		System.out.println("There's something glimmering in the distance. Could it be...?");
		 
		}
		}
	
		if(goldy-1 > 0){
		if (dungeon[cellx][celly] == dungeon[goldx][goldy-1]){
		System.out.println("There's something glimmering in the distance. Could it be...?");
		 
		}
		}
		
		if(wumpusx+1 < 4){
		if (dungeon[cellx][celly] == dungeon[wumpusx+1][wumpusy]){
		System.out.println("Distinct aroma of ...something wafting from around here...");
		 
		}
		}
		
		if(wumpusx-1 > 0){
		if (dungeon[cellx][celly] == dungeon[wumpusx-1][wumpusy]){
		System.out.println("Distinct aroma of ...something wafting from around here...");
		 
		}
		}
		
		if(wumpusy+1 < 4){
		if (dungeon[cellx][celly] == dungeon[wumpusx][wumpusy+1]){
		System.out.println("Distinct aroma of ...something wafting from around here...");
		 
		}
		}
		
		if(wumpusy-1 > 0){
		if (dungeon[cellx][celly] == dungeon[wumpusx][wumpusy-1]){
		System.out.println("Distinct aroma of ...something wafting from around here...");
		 
		}
		}
		}
		//to do
		//put save stuff here. use a temp matrix?
		//System.exit(0) ends the program (do this for save)
}
}
