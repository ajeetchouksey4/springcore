package basics;

public class App implements Runnable {
	public static void main(String[] args) {
		App app = new App();
		Thread t1 = new Thread(app);
		App2 app2 = new App2();
		app2.start();
		
		t1.start();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for(int i=0;i<2;i++) {
				System.out.println("Thread created and started");
				Thread.sleep(0);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
