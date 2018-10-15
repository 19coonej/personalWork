package OOP;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle bob = new Rectangle();
		System.out.println("The length is: " + bob.getLength());
		System.out.println("The height is: " + bob.getHeight());
		bob.setLentgh(5);
		bob.setHeight(6);
		System.out.println("The length is: " + bob.getLength());
		System.out.println("The height is: " + bob.getHeight());
		System.out.println("The area is: " + bob.area());
		System.out.println("The perimeter is: " + bob.perimeter());

	}

}
