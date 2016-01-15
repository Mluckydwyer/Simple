// Link to Google Slides about CPU
// 
package threads;

// This is the runner & main class
public class mainClass {
	
	public static void main(String[] args) {
		// Start the program
		System.out.println("This was printed from the main method\n");
		
		
		// Create a new Object of the class and call the constructor
		Thread thread = new Thread(new threadedClass());

		
		System.out.println("This was also printed from the main method\n");
		
		
		// Start/Run the new Thread
		thread.start();
		
		// The  two threads are now operating independently of one another
		
		
		System.out.println("Main Thread Ending");
	}

}
