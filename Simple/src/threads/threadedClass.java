package threads;

/* 
 * This is the class that you can make an object out
 * of to run in a separate thread from the main program
 * 
 * This Tells Java That it can be run as a Thread
 *                        \/ \/ \/ \/ \/ \/ \/ \/
*/
public class threadedClass implements Runnable {

	/*
	 * This is the constructor, this is called when you create a new object of
	 * this class.
	 */
	public threadedClass() {
		System.out.println("This was printed from a constructor\n");
	}

	/*
	 * This is an Implemented method required in all runnable classes
	 * 
	 * This is the first Code that will run once the thread has started, sort of
	 * like a main method (public static void main(String[] args))
	 */
	@Override
	public void run() {
		System.out.println("This was printed from a different Thread!!!\n");

		// Sleep for 5 seconds (5,000 milliseconds)
		pause(5000);

		// print something out
		methodPrint();
		
		//End Message
		System.out.println("Second Thread Ending");
	}

	// Prints a simple statement about how this as printed
	public void methodPrint() {
		System.out.println("This was printed from a method from a different thread\n");
	}

	/*
	 * Causes the new thread to wait for a certain amount of time while the
	 * other main thread is unaffected, they are separate.
	 * 
	 * The Try/Catch is just there to tell java that an exception might be
	 * thrown and not to worry about it and continue \/ \/ \/ \/ \/ \/ \/ \/ \/
	 * \/
	 */
	public void pause(int milliseconds) {

		try {
			Thread.sleep(milliseconds);
		}
		catch (Exception e) {
		}

	}
}
