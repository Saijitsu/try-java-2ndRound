package abstractLegacy;

public class Liger extends Animal {

	public Liger(String name) {
		this.setName(name);
	}

	@Override
	public String sleep() {
		return " " + this.getName() + ", the little Abstract Liger is spleeping!";
	}
}