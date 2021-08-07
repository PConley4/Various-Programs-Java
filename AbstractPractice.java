package snippet;

public class AbstractPractice {
	
//note that in order to make a object from a parent class in void main, the child and parent both need to be not static or static (although since void main is static they all need to be static
//this is due to enclosing issues which you should know about
public static abstract class printer{
	public void getSystemResource() {
		System.out.println("Memory I/O");
	}
	
	public abstract void print();
}//printer can't have a child inside of it. It is supposed to act like a parent class here

	public static class Canon extends printer{
		public void print() {
			System.out.println("Canon prints well, but has bad ink storage.");
		}
	}
	
	public static class HP extends printer{
		public void print() {
			System.out.println("HP prints well.");
		}
	}
	
	public static class Lexmark extends printer{
		public void print() {
			System.out.println("What is Lexmark?");
		}
	}

	//public class Demo extends printer{
	public static void main(String[] args) {
		Canon Canonprinter = new Canon();
		Canonprinter.getSystemResource();
		Canonprinter.print();
		HP HPprinter = new HP();
		HPprinter.getSystemResource();
		HPprinter.print();
		Lexmark Lexmarkprinter = new Lexmark();
		Lexmarkprinter.getSystemResource();
		Lexmarkprinter.print();
		//}
		}
	}
