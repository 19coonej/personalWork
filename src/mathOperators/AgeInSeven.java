package mathOperators;
import java.util.Scanner;
public class AgeInSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt() + 7;
		System.out.println("Your age in 7 years will be: " + age);
		
		
	}

}
