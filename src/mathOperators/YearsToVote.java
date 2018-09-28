package mathOperators;
import java.util.Scanner;
public class YearsToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int years = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		years = 18 - input.nextInt();
		System.out.println("In " + years + " years you will be able to vote!");
		
	
	}

}
