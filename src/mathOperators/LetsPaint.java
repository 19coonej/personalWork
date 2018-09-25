package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int length = -999;
		int width = -999;
		int area = -999;
		int gallons = -999;
		int smallArea = -999;
		int bigArea = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the room?");
		length = input.nextInt();
		System.out.println("What is the width of the room?");
		width = input.nextInt();
		smallArea = (width * 8) * 2;
		bigArea = (length * 8) * 2;
		area = smallArea + bigArea;
		gallons = (area/150) + 1;
		System.out.println("The dimensions of the room are: " + length + " x " + width + " x " + " 8 ");
		System.out.println("The area of wall space is: " + area + " square feet.");
		System.out.println("You need: " + gallons + " gallons of paint.");
		
		
		
		
		
	}

}
