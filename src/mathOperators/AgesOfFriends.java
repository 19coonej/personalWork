package mathOperators;
import java.util.Scanner;
public class AgesOfFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageOne = -999;
		int ageTwo = -999;
		int ageThree = -999;
		int sumAge = -990;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How old is one of your friends?");
		ageOne = input.nextInt();
		System.out.println("How old is another one of your friends?");
		ageTwo = input.nextInt();
		System.out.println("How old is ANOTHER one of your friends?");
		ageThree = input.nextInt();
		sumAge = ageOne + ageTwo + ageThree;
		System.out.println("The sum of your friends' ages is: " + sumAge);
		
		
	}

}
