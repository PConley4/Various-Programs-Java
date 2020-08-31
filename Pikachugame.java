package snippet;

public class Pikachugame {

	
	public Pikachugame() {
	}
		public static void main(String[] args){
		//Scanner input = new Scanner(System.in);
		int count = 0;
		while(count < 41) {
			count++;
			if(count%3 == 0) {
				System.out.println("Pika");
			}
			else if(count%5 == 0) {
				System.out.println("Chu");
		}
			else{
				System.out.println(count);
			}
		}
	}
}
