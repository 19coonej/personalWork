package decisions;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		if (age + gpa > 20)
		{
			System.out.println("You will receive $250.");
		}
		if (age + gpa <= 20)
		{
			System.out.println("You will receive $30.");
		}
		

	}

}
