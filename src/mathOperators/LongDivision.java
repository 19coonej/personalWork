package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividend = -999;
		int divisor = -999;
		int answer = -999;
		int remainder = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		answer = dividend/divisor;
		remainder = dividend%divisor;
		System.out.println("Answer: " + answer + " Remainder: " + remainder);
		
		
	}

}
