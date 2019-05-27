package tplegacy.version2;

public class Animal {

	// VAR
	protected String name;
	protected int age;
	protected int maxAge;

	public Animal(String name, int age, int maxAge) {
		super();
		this.name = name;
		this.maxAge = maxAge;
		this.setAge(age);

	}

	// GET SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0 || age >= this.maxAge) {
				this.age = 1;
				throw new ArithmeticException();
			} else {
				this.age = age;
			}
		} catch (ArithmeticException e) {
			System.out.println("Erreur d'age l'espece : " + this.getName() + " vie entre 0 et " + this.maxAge + " ans");
		}
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		return "Animal:" + name + ", age= " + age + " an(s)";
	}
}
