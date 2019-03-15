import java.util.ArrayList;

public class Command {

	private String name;
	private String description;
	private String syntax;
	private ArrayList<Object> args;

	/**
	 * Creates a command object with only a name.
	 * 
	 * Default Values Assigned:
	 *  - Description: blank
	 *  - Syntax: "No syntax specified"
	 *  - Args: Empty ArrayList of class: Object
	 * 
	 * @param name - The name of the command.
	 */
	public Command(String name) {
		this(name, "", "No syntax specified.", new ArrayList<>());
	}

	/**
	 * Creates a command object with only a name and description.
	 * 
	 * Default Values Assigned:
	 *  - Syntax: "No syntax specified"
	 *  - Args: Empty ArrayList of class: Object
	 * 
	 * @param name - The name of the command.
	 * @param description - The description of what the command will do.
	 */
	public Command(String name, String description) {
		this(name, description, "No syntax specified.", new ArrayList<>());
	}

	/**
	 * Creates a command object with only a name, description, and syntax.
	 * 
	 * Default Values Assigned:
	 *  - Args: Empty ArrayList of class: Object
	 * 
	 * @param name - The name of the command.
	 * @param description - The description of what the command will do.
	 * @param syntax - The commands usage/syntax. Typically includes an example command or two.
	 */
	public Command(String name, String description, String syntax) {
		this(name, description, syntax, new ArrayList<>());
	}

	/**
	 * Creates a command object with only a name, description, syntax, and argument types.
	 * 
	 * @param name - The name of the command.
	 * @param description - The description of what the command will do.
	 * @param syntax - The commands usage/syntax. Typically includes an example command or two.
	 * @param args - An array list of the order, and object type the arguments should follow.
	 */
	public Command(String name, String description, String syntax, ArrayList<Object> args) {
		this.name = name;
		this.description = description;
		this.syntax = syntax;
		this.args = args;
	}

	public String getName() {
		return this.name;
	}

	public String getSyntax() {
		return this.syntax;
	}

	public String getDescription() {
		return this.description;
	}

}
