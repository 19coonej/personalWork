package OOP;

public class Greeter {
	private int age;

	public Greeter() {
		age = 18;
	}

	public void sayHello() {

		System.out.println("Hello");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
}
