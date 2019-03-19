import java.util.ArrayList;
import java.util.Scanner;

public class Terminal extends Thread {
	private ArrayList<Command> cmds;
	private Scanner in;
	private char prompt = '>';

	public Terminal() {
		this.cmds = new ArrayList<>();
		this.in = new Scanner(System.in);
	}

	public Terminal(char prompt) {
		this.cmds = new ArrayList<>();
		this.in = new Scanner(System.in);
		this.prompt = prompt;
	}

	/**
	 * Adds a command to the command list with only a name, description, syntax, and argument types.
	 * 
	 * @param name - The name of the command.
	 * @param description - The description of what the command will do.
	 * @param syntax - The commands usage/syntax. Typically includes an example command or two.
	 * @param args - An array list of the order, and object type the arguments should follow.
	 */
	public void addCommand(String name, String description, String syntax, ArrayList<Object> args) {
		cmds.add(new Command(name, description, syntax, args));
	}
	
	/**
	 * Adds a command to the command list with only a name, description, and syntax.
	 * 
	 * Default Values Assigned:
	 *  - Args: Empty ArrayList of class: Object
	 * 
	 * @param name - The name of the command.
	 * @param description - The description of what the command will do.
	 * @param syntax - The commands usage/syntax. Typically includes an example command or two.
	 */
	public void addCommand(String name, String description, String syntax) {
		cmds.add(new Command(name, description, syntax, new ArrayList<>()));
	}
	
	/**
	 * Adds a command to the command list with only a name and description.
	 * 
	 * Default Values Assigned:
	 *  - Syntax: "No syntax specified"
	 *  - Args: Empty ArrayList of class: Object
	 * 
	 * @param name - The name of the command.
	 * @param description - The description of what the command will do.
	 */
	public void addCommand(String name, String description) {
		cmds.add(new Command(name, description, "No syntax specified.", new ArrayList<>()));
	}

	/**
	 * Adds a command to the command list with only a name.
	 * 
	 * Default Values Assigned:
	 *  - Description: blank
	 *  - Syntax: "No syntax specified"
	 *  - Args: Empty ArrayList of class: Object
	 * 
	 * @param name - The name of the command.
	 */
	public void addCommand(String name) {
		cmds.add(new Command(name, "", "No syntax specified.", new ArrayList<>()));
	}

	@Override
	public void run() {
		String input;

		while (true) {
			// Print each command

			for (Command cmd : cmds) {
				System.out.println(cmd.getName() + " - " + cmd.getDescription());
			}

			System.out.print("============\n" + prompt);
			input = in.next();

			System.out.println("You typed: " + input);
		}
	}
}
