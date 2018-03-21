public class Program {
	private static String temp; // String for storing temporary information.

	public static void input(String input) {
		// Check if input is valid
		String[] args = input.split(" ");
		if (args.length >= 1) {
			int inputInt = Integer.parseInt(args[0]);
			switch (inputInt) {
			case 1:
				help();
				break;
			case 2:
				feature();
				break;
			case 3:
				feature();
				break;
			case 4:
				feature();
				break;
			case 5:
				exit();
				break;
			}
		} else {
			System.out.println(Strings.error + "Input is invalid.");
		}

	}

	// An example feature.
	private static void feature() {
		String text1 = getInput("Enter text: ");

		char[] text2 = text1.toCharArray();

		System.out.print("Reversed text: ");
		for (int i = text2.length - 1; i >= 0; i--) {
			System.out.print(text2[i]);
		}

		System.out.println();
	}

	// Display help information.
	private static void help() {
		System.out.println("Command 1: Display help.\n"
			+ "Command 2: A feature.\n"
			+ "Command 3: A feature.\n"
			+ "Command 4: A feature.\n"
			+ "Command 4: Exit.");
	}

	// Prompt user to exit the program.
	private static void exit() {
		temp = getInput("Are you sure you want to exit? (y/n) ");
		if (temp.equals("y") || temp.equals("yes")) {
			// We do print instead of println to avoid a ghost line at the bottom.
			System.out.print(Strings.ok + "Exiting...");
			System.exit(0);
		} else {
			return;
		}
	}

	// Display a message and get the users input.
	private static String getInput(String message) {
		System.out.print(message);
		String input = Main.in.next();
		return input;
	}
}
