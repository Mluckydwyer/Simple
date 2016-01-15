package threads;

public class threadedClassExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Second Thread Starting\n");
		
		// Start counting
		startCounting();
	}

	// Start counting up from 0
	public void startCounting() {
		int count = 0;
		
		// Endless Loop
		while(true) {
			System.out.println("Second Thread: " + count);
			count = count + 1;
			pause(2000);
		}
		
	}

	// wait for a certain amount of time
	public void pause(int milliseconds) {

		try {
			Thread.sleep(milliseconds);
		}
		catch (Exception e) {
		}

	}
	
}
