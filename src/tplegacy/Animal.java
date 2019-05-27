package tplegacy;

public class Animal {
	// Variable
	protected String name;
	protected int age;

	// Constructor
	public Animal(String name, int age) {
		super(); // Rest Object value
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int setAge(int age, int max) {
		if (age <= max && age >= 0) {
			return this.age = age;
		} else {
			throw new ArithmeticException("Animal age must be between (include) 0 & " + this.age + " !");
		}
	}

	// Getter /Setter (Method)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

}
