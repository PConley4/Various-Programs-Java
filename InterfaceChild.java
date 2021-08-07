package snippet;

public class InterfaceChild extends InterfaceSuper{

	static class Emolga implements Pokemon{
		//to change this string, you should have a get method?
		//category = "sky squirrel";
		//note that in order to make a object from a parent class in void main, the child and parent both need to be not static or static (although since void main is static they all need to be static
		//this is due to enclosing issues which you should know about
		public void cry() {
			System.out.println("The Emolga goes 'Squee'");
		}
		public void sleep() {
			System.out.println("Zzz...");
		}
	}
	public static void main(String[] args) {
		Emolga myEmolga = new Emolga();
		setCategory(myEmolga.category);
		System.out.println(myEmolga.category);
		myEmolga.cry();
		myEmolga.sleep();
	}

}
