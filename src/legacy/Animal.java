package legacy;

public class Animal {
	// Variable
	private String name;

	// Constructor
	public Animal(String name) {
		super(); // Rest Object value
		this.name = name;
	}

	// Method
	public String sleep() {
		return " " + this.getName() + ", is spleeping!";
	}

	// Getter /Setter (Method)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
