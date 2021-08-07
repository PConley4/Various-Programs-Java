package snippet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TryCatchPractice {
	public static int[] test = {2, 3, 5};
	public static ArrayList<Integer> listI = new ArrayList<>(Arrays.asList(2,7,3,8));	
	public static void main(String[] args) {
		//TypeMismatchHandle();
		NullPointerHandle();
	}

	public static void TypeMismatchHandle() {
		try {
		System.out.println("Type in a number.");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
			System.out.println(input);
		}
		catch(Exception e) {
			System.out.println("The type of your input does not match.");
		}
	}
	
	public static void NullPointerHandle(){
		try {
			//System.out.println(test[2]);
			int last = 0;
			System.out.println("Type in a number.");
			Scanner scan = new Scanner(System.in);
			listI.add(scan.nextInt());
			last = last + listI.size();
			System.out.println(listI.get(last));
			
		}
		catch(Exception IndexOutofBounds) {
			System.out.println("Index Out of Bounds");
		}
	}
}
