package outputExamples;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("How many students took the test?");
	int students = input.nextInt();
	int counter = 1;
	int score = 0;
	int sum = 0;
	for (counter = 1; counter <= students; counter ++)
	{
		System.out.println("Input a student score.");
		score = input.nextInt();
		sum = sum + score;
	}
	System.out.println("The class average is: " + (sum/students));

	}

}
