package snippet;
import java.util.concurrent.ThreadLocalRandom;
public class Reverseint {

	public static void main(String[] args) {
		long mainnum = 1534236469; //the number we are reversing.
		boolean type = true; //this stores a value based on positive or negative
		long temp = 0;
		long reverse = 0; //this is where the reverse number will be stored.
		
		System.out.println(mainnum);
		
		if(mainnum > 0) {
			type = true;
		}
		else if(mainnum < 0) {
			type = false;
			mainnum = mainnum * -1;
		}
		
		while(mainnum != 0) {
			temp = mainnum % 10;
			System.out.println("Temp, which is the mod. " + temp);
			reverse =  (reverse * 10) + temp;
			System.out.println("The whole reverse long. " + reverse);
			mainnum = (mainnum - temp) / 10;
			System.out.println("The decreasing mainnum. " + mainnum);
		}
		
		if(type == false) {
			reverse = reverse * -1;
		}
		System.out.println(reverse);
	}

}
