package OOP;

public class TestCat {

	public static void main(String[] args) {
	Cat bob = new Cat();
	System.out.println("The age of the cat is: " + bob.getAge());
	System.out.println("The amount of hours the cat sleeps is: " + bob.getSleep());
	bob.setAge(72);
	bob.setSleep(8);
	System.out.println("The age of the cat is: " + bob.getAge());
	bob.birthday();
	System.out.println("The age of the cat is: " + bob.getAge());
	System.out.println("The amount of hours the cat sleeps is: " + bob.getSleep());
	System.out.println("The amount of hours the cat sleeps is: " + bob.sleepMore());
	System.out.println("The amount of hours the cat sleeps is: " + bob.sleepLess());
	//System.out.println("The age of the cat is: " + bob.birthday());


	}

}
