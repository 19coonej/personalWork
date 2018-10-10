package OOP;

public class TestClassCircle {

	public static void main(String[] args) {
Circle bob = new Circle();
System.out.println("The radius is:" + bob.getRadius());
bob.setRadius(5.0);
System.out.println("The radius is: " + bob.getRadius());
System.out.println("The area is: " + bob.area());
System.out.println("The circumference is: " + bob.circumference());
	}

}
