package abstractLegacy;

public abstract class Animal {
	// Variable
	private String name;

	// no construtor, not instanciable if abstract 

	// Method
	public abstract String sleep(); // Must be creat in child class
	// Abstract method : no {}

	// Getter /Setter (Method)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
