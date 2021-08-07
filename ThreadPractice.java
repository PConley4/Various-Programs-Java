package snippet;

public class ThreadPractice extends Thread {


	public static void main(String[] args) {
		ThreadPractice thread =  new ThreadPractice();
		thread.start();
		System.out.println("This code is out the thread.");
	}

	public void run() {
		System.out.println("This code is inside the thread.");
	}

}
