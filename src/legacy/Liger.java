package legacy;

public class Liger extends Animal {

	public Liger(String name) {
		super(name); // Legacy.Animal.Animal
		// Used tu rest name from Animal constructor
	}

	@Override
	public String sleep() {
		return " " + this.getName() + ", the little Liger is spleeping!";
	}

}
