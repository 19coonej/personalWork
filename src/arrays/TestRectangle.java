package arrays;
import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many rectangles?");
		int numRec = input.nextInt();
		Rectangle bob[] = new Rectangle[numRec];
		for (int i = 0; i < numRec; i++)
		{
			System.out.println("Enter a length.");
			int length = input.nextInt();
			System.out.println("Enter a width.");
			int width = input.nextInt();
			bob[i] = new Rectangle(length, width);
		}
		System.out.println(bob[1].perimeter());

	}

}
