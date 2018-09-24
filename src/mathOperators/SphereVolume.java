package mathOperators;
import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = -999.99;
		final double INITIAL = 1.33333333333333333333;
		double volume = -999.999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		volume = INITIAL * Math.PI * (radius * radius * radius);
		System.out.println("The volume of the sphere is: " + volume);
		
		
		
		
		
		
	}

}
