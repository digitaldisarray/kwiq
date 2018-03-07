import java.util.Scanner;

public class Main {
	/*
	 * Digital Disarray 1-20-2018
	 * 3rd project of 2018! :) *Originally made for GitReader
	 * 
	 * The purpose of this project is to help devs make quick user friendly command line interfaces.
	 */
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String input = null;
		System.out.println(Strings.title);
		while (true) {
			System.out.print(Strings.menu + "\n" + Strings.prompt); // Prompt user.
			input = in.next(); // Get input and assign to string 'input'.
			Program.input(input); // Send user input to be dealt with.
		}
	}
}
