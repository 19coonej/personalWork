package OOP;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter bob = new Greeter();
		bob.sayHello();
		System.out.println(bob.getAge());
		bob.setAge(5);
		System.out.println(bob.getAge());
		Friend john = new Friend();
		john.sayMessage();
		Friend jenny = new Friend();
		Friend billy = new Friend();
		Friend sammy = new Friend();
		Friend kyle = new Friend();
		billy.sayMessage();
		kyle.sayMessage();
		
	}

}
