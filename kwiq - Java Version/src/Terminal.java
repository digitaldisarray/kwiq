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

	// TODO: Make one of these for every constructor that exists in the command class	
	public void addCommand(String name, String syntax, ArrayList<Object> args) {
		cmds.add(new Command(name, syntax, args));
	}
	
	public void addCommand(String name) {
		cmds.add(new Command(name));
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
