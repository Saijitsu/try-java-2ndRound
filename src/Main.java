import legacy.*;

public class Main {

	public static void main(String[] args) {
		// Animal Class
		Animal dog = new Animal("Dog");
		System.out.println(dog.sleep());
		
		// Animal Legacy > Liger
		Liger puppet = new Liger("Puppet");
		System.out.println(puppet.sleep());
	}
}
