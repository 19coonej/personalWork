import java.util.Scanner;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How many students took the test?");
		int students = input.nextInt();
		int counter = 1;
		int score = 0;
		int sum = 0;
		for (counter = 1; counter <= students; counter++)
		{
			System.out.println("Enter test score.");
			score = input.nextInt();
			sum = sum + score;
		}
		System.out.println("The class average is: " + sum/students);
		
	}

}
