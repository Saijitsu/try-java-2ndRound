import legacy.*;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal("Dog");
		System.out.println(dog.sleep());

		Liger puppet = new Liger("Puppet");
		System.out.println(puppet.sleep());
	}
}
