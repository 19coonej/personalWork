package decisions;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Are you a senior? (true or false)");
		boolean cla = input.nextBoolean();
		if (cla == true)
		{	
			System.out.println("What is your GPA?");
			double gpa = input.nextDouble();
			if (gpa >= 3.5)
			{
				System.out.println("You are eligible to graduate with honors.");
			}
		}
		else
		{
			System.out.println(":(");
		}
	}

}
