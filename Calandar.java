package snippet;

import java.util.Scanner;


public class Calandar {
	public static void main(String[] args){
		int useapp = 0;
		Scanner input = new Scanner(System.in); 
		int month = 0;// this input will store the month the user wants to see
		int date = 0; //this input will store the date the user wants to edit
		//int edit = 0;
		   String[] Jan = new String[30];
		   String[] Feb = new String[28];
		   String[] Mar = new String[30];
		   String[] Apr= new String[29];
		   String[] May = new String[30];
		   String[] Jun= new String[29];
		   String[] Jul= new String[30];
		   String[] Aug= new String[30];
		   String[] Sep= new String[29];
		   String[] Oct= new String[30];
		   String[] Nov= new String[29];
		   String[] Dec= new String[30];
		
		System.out.println("Would you like to use the app? 0 for no, and 1 for yes."); 
		   useapp = input.nextInt();
		
	   while(useapp == 1) {
		   //edit = 0;
		   System.out.println("Type the number of the month you want to look at. 1 through 12. January for 1, March for 3, etc."); //this is for the month the user wants. the year is irrelavant.
		   month = input.nextInt();
	   switch (month){
	   case 1:
	   System.out.println("This is the month of January. Select a date 1-30:");
	   date = input.nextInt();
	   System.out.println(Jan[date] + " This is note for this day.");
	   
	   Jan[date] = makeanote();
	   
	   break;
	   
	   case 2:
		   System.out.println("February. Select a date 1-29.");
		   date = input.nextInt();
		   System.out.println(Feb[date] + " This is note for this day.");
		   Feb[date] = makeanote();
       break;

	   case 3:
		   System.out.println("March. Select a date 1-31.");
		   date = input.nextInt();
		   System.out.println(Mar[date] + " This is note for this day.");
		   Mar[date] = makeanote();
       break;
   
	   case 4:
		   System.out.println("April. Select a date 1-30.");
		   date = input.nextInt();
		   System.out.println(Apr[date] + " This is note for this day.");
		   Apr[date] = makeanote();
	   break;
   
	   case 5:
		   System.out.println("May. Select a date 1-31.");
		   date = input.nextInt();
		   System.out.println(May[date] + " This is note for this day.");
		   May[date] = makeanote();
	   break;

	   case 6:
		   System.out.println("June. Select a date 1-30.");
		   date = input.nextInt();
		   System.out.println(Jun[date] + " This is note for this day.");
		   Jun[date] = makeanote();
	   break;

	   case 7:
		   System.out.println("July. Select a date 1-31.");
		   date = input.nextInt();
		   System.out.println(Jul[date] + " This is note for this day.");
		   Jul[date] = makeanote();
	   break;
  
	   case 8:
		   System.out.println("August. Select a date 1-31.");
		   date = input.nextInt();
		   System.out.println(Aug[date] + " This is note for this day.");
		   Aug[date] = makeanote();
	   break;

	   case 9:
		   System.out.println("September. Select a date 1-30.");
		   date = input.nextInt();
		   System.out.println(Sep[date] + " This is note for this day.");
		   Sep[date] = makeanote();
	   break;

	   case 10:
		   System.out.println("October. Select a date 1-31.");
		   date = input.nextInt();
		   System.out.println(Oct[date] + " This is note for this day.");
		   Oct[date] = makeanote();
	   break;

	   case 11:
		   System.out.println("November. Select a date 1-30.");
		   date = input.nextInt();
		   System.out.println(Nov[date] + " This is note for this day.");
		   Nov[date] = makeanote();
	   break;

	   case 12:
		   System.out.println("December. Select a date 1-31.");
		   date = input.nextInt();
		   System.out.println(Dec[date] + " This is note for this day.");
		   Dec[date] = makeanote();
       break;

       default:
	   }
	   System.out.println("Would you like to continue? 0 for No, and 1 for Yes."); 
	   useapp = input.nextInt();
	   }
	   input.close();
	}
	public static String makeanote(){
		Scanner input = new Scanner(System.in); 
		String note = ""; //this will store the note the user wants to make, and write it to the array.
		System.out.println("What note would you like to make?");
		note = input.nextLine();
		System.out.println(note + " is the note.");
		//input.close();
		return note;
	}
}
