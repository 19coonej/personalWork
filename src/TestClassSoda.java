import java.util.Scanner;
public class TestClassSoda {

	public static void main(String[] args) {
	SodaCan bob = new SodaCan();
	bob.setHeight(10);
	bob.setRadius(6);
	System.out.println("SA is: " + bob.surfaceArea());
	SodaCan jim = new SodaCan(4.6, 5.3);
	System.out.println("V is: " + jim.surfaceArea());

	}

}
