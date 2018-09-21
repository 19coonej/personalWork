package inputExamples;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = false;
		Scanner input = new Scanner(System.in);
		System.out.println("You voted. True or False?");
		answer = input.nextBoolean();
		System.out.println(answer);
	}

}
