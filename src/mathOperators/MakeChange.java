package mathOperators;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double change = -999.99;
		double dimes = -999;
		double nickels = -999;
		double pennies = -999;
		double quarters = -999;
		double dollars = -999;
		int quartersTwo = -999;
		int penniesTwo = -999;
		int dimesTwo = -999;
		int nickelsTwo = -999;
		int dollarsTwo = -999;
		double subFromNick = -999;
		double subFromPen = -999;
		double subFromPent = -999;
		double subFromQ = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your dollar.cent total?");
		change = input.nextDouble();
		
		dollars = (change / 1);
		dollarsTwo = (int) dollars;
		subFromQ = dollarsTwo * (1);
		quarters = ((change - subFromQ) / (0.25));
		quartersTwo = (int) quarters;
		subFromNick = (quartersTwo * (.25)) + (dollarsTwo * 1);
		dimes = ((change - subFromNick) / (0.10));
		dimesTwo = (int) dimes;
		subFromPen = ((dimesTwo * .10) + (quartersTwo * .25) + (dollarsTwo * 1));
		nickels = ((change - subFromPen) / 0.05);
		nickelsTwo = (int) nickels;
		subFromPent = ((nickelsTwo * .05) + (quartersTwo * .25) + dimesTwo * .10) + (dollarsTwo * 1);
		pennies = ((change - subFromPent) / (.01));
		penniesTwo = (int) pennies;

		System.out.println("dollars: " + dollarsTwo);
		System.out.println("quarters: " + quartersTwo);
		System.out.println("dimes: " + dimesTwo);
		System.out.println("nickels: " + nickelsTwo);
		System.out.println("pennies: " + penniesTwo);

	}

}
