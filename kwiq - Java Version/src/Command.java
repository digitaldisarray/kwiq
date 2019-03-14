import java.util.ArrayList;

public class Command {

	private String name;
	private String description;
	private String syntax;
	private ArrayList<Object> args;

	// TODO: I forgot the way to make these constructors not so janky

	public Command(String name) {
		this.name = name;
		this.description = "";
		this.syntax = name + " <args>";
		this.args = new ArrayList<>();
	}

	// TODO: I forgot the way to make these constructors not so janky

	public Command(String name, ArrayList<Object> args) {
		this.name = name;
		this.description = "";
		this.syntax = name + " <args>";
		this.args = args;
	}

	// TODO: I forgot the way to make these constructors not so janky

	public Command(String name, String syntax, ArrayList<Object> args) {
		this.name = name;
		this.description = "";
		this.syntax = syntax;
		this.args = args;
	}

	// TODO: I forgot the way to make these constructors not so janky

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
