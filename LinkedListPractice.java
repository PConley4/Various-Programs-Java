package snippet;

import java.util.*; 

class LinkedListPractice {

	public LinkedListPractice() {
		//contain boolean cannot be put here because what needs it is not in a LinkedListPracticeobject
	}

	public static void main(String[] args) {
		boolean contain = false;
        LinkedList<String> Pika = new LinkedList<String>(); 
        Pika.add("Splishy Splash");
        Pika.add("Zippy Zap");
        Pika.addFirst("Volt Tackle");
        Pika.addLast("Floaty Fall");
        System.out.println("Chu's Signature moves are:" + Pika);
        
        Pika.remove("Volt Tackle");
        Pika.add("Volt Tackle");
        Pika.remove(3);
        Pika.addLast("Pika Papow");
        System.out.println("Pikachu's Signature moves are:" + Pika);
        
        if (Pika.contains("Zippy Zap")){
        	contain = true;
        }
        
        if (contain = true) {
        	System.out.print("That's all the moves! ");
        }
        System.out.println("The number of all the moves is " + Pika.size() + ".");
        System.out.print("The best one is " + Pika.get(1) + ".");
        //always have a list of actions you can do with a Linked List handy

	}

}
