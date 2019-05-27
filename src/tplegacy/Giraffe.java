package tplegacy;

public class Giraffe extends Animal {
	public Giraffe(String name, int age) {
		super(name, age);
		this.name = name;
		this.age = setAge(age, 40);
	}
}
