package arrays;
import java.util.Random;
public class TestRectangleAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		final int rectangle = 100;
		Rectangle[] bob = new Rectangle[rectangle];
		int wMax1 = 56;
		int wMin1 = 10;
		int length = 20;
		int side1 = 0;
		int smallestRec = 0;
		int side2 = 0;
		
		for (int i = 0; i < rectangle; i++) {
			side1 = wMin1 + generator.nextInt(wMax1 - wMin1 + 1);
			side2 = wMin1 + generator.nextInt(wMax1 - wMin1 + 1);
			bob[i] = new Rectangle(side1, side2);
		}
		for (int i = 0; i < rectangle; i++) {
			System.out.println(bob[i].getLength());
			System.out.println(bob[i].getWidth());
			System.out.println(bob[i].area());
		}
		int smallest = 9999999;
		for (int z = 0; z < rectangle; z++)
		{
			if (bob[z].area() < smallest)
			{
				smallest = bob[z].area();
				smallestRec = z + 1;
			}
		}
		bob[0] = bob[smallestRec];
System.out.println(bob[0]);
	}

}
