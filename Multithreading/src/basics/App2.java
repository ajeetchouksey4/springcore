package basics;

public class App2 extends Thread {

	public void run() {
		System.out.println("Start RUnning");
	}

	public static void main(String[] args) {
		App2 app = new App2();
		app.start();
	
	}
}
