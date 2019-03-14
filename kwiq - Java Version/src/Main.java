
public class Main {
	public static void main(String[] args) {
		// Create our terminal object
		Terminal myTerm = new Terminal();
		
		// Add however many commands we want (could potentially add from a database or text file)
		myTerm.addCommand("help");
		
		// Start out terminal. But remember, our terminal is a thread so we can run code after this.
		myTerm.start();
	}
}
