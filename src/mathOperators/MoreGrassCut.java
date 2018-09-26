package mathOperators;
import java.util.Scanner;
public class MoreGrassCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int length = -999;
		int width = -999;
		int deck = -999;
		int speed = -999;
		int area = -999;
		int ugh = -999;
		int blah = -999;
		int aye = -999;
		final int rate = 12;
		Scanner input = new Scanner(System.in);
		System.out.println("Length?");
		length = input.nextInt();
		System.out.println("Width?");
		width = input.nextInt();
		System.out.println("Deck length in inches?");
		deck = input.nextInt() /12;
		System.out.println("How fast?");
		speed = input.nextInt();
		area = width * length;
		ugh = deck * speed;
		blah = area/ugh;
		aye = blah * 12;
		System.out.println("you owe this many dollars: " + aye);
		
		
		
		
	}

}
