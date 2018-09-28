package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int milesOver  = -999;
		int speed = -999;
		int speedLimit = -999;
		int costofTicket = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What was the speed limit?");
		speedLimit = input.nextInt();
		System.out.println("How fast were you going?");
		speed = input.nextInt();
		milesOver = speed - speedLimit;
		costofTicket = (55 + (milesOver-1)*40);
		System.out.println("Your ticket costs: " + costofTicket + " dollars.");
		
		
		
		
		
		
	}

}
