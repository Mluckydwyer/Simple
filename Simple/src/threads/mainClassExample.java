package threads;

// This is the runner & main class
public class mainClassExample {
	
	public static void main(String[] args) {
		// Start the program
		System.out.println("This was printed from the main method\n");
		
		
		Thread thread = new Thread(new threadedClassExample());
		
		
		// Start/Run the new Thread. The two threads are now operating independently of one another
		thread.start();
		
		
		// Call an opposite counting method
		startCountingBackward();
		
		
		System.out.println("Main Thread Ending");
	}

	// Start counting down from 1,000
		public static void startCountingBackward() {
			int count = 1000;
			
			// Endless Loop
			while(true) {
				System.out.println("Main Thread: " + count);
				count = count - 1;
				pause(2000);
			}
			
		}
	
		// wait for a certain amount of time
		public static void pause(int milliseconds) {

			try {
				Thread.sleep(milliseconds);
			}
			catch (Exception e) {
			}

		}
	
}
