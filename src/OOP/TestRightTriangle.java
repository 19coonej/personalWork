package OOP;

public class TestRightTriangle {

	public static void main(String[] args) {
	RightTriangle bob = new RightTriangle();
	System.out.println("The height is: " + bob.getHeight());
	System.out.println("The base is: " + bob.getBase());
bob.setHeight(5);
bob.setBase(4);
System.out.println("The hypotenuse is: " + bob.hypot());
System.out.println("The height is: " + bob.getHeight());
System.out.println("The base is: " + bob.getBase());
System.out.println("The perimeter is: " + bob.perimeter());
System.out.println("The area is: " + bob.area());

	}
}
