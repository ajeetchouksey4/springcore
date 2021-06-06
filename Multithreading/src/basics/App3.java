package basics;

class UserThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Cutom UserThread method");
		Thread my = Thread.currentThread();
		System.out.println(my.getName());

	}

}

public class App3 {
	public static void main(String[] args) {
		System.out.println("Started Executing code...");
		try {
			Thread my = Thread.currentThread();
			System.out.println("Old Thread Name:  " + my.getName());
			my.setName("myThread");

			Thread.sleep(25);
			System.out.println("My Thread New Name-   " + my.getName());
			System.out.println("Ending program");
			
			UserThread usr = new UserThread();
			Thread t1 = new Thread(usr);
			t1.run();
			

		} catch (InterruptedException ex) {
			System.out.println();
		}
	}
}
