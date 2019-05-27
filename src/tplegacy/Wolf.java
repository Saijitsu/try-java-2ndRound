package tplegacy;

public class Wolf extends Animal {
	public Wolf(String name, int age) {
		super(name, age); 
		this.name = name;
		this.age = setAge(age, 10);
	}
}
