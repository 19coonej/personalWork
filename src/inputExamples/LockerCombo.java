package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOne = -999;
		int numberTwo = -999;
		int numberThree = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first number in your locker combo?");
		numberOne = input.nextInt();
		System.out.println("What is the second number in your locker combo?");
		numberTwo = input.nextInt();
		System.out.println("What is the third number in your locker combo?");
		numberThree = input.nextInt();
		System.out.println("Your locker combo is: " + numberOne + numberTwo + numberThree);
		
	}

}
