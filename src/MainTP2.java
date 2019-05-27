import tplegacy.Giraffe;
import tplegacy.Wolf;
import tplegacy.version2.*;

public class MainTP2 {

	public static void main(String[] args) {
		//Animal Class default
		System.out.println("Class Animal");
		Animal animal = new Animal("Animal", 45, 80);
		animal.setAge(88);
		System.out.println(animal.toString());

		// Animal Legacy > Giraffe
		Giraffe puppet = new Giraffe("Puppet", 12);
		System.out.println(puppet.toString());

		Wolf puppy = new Wolf("Puppet", 44);
		System.out.println(puppy.toString());

	}
}