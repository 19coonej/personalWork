import java.util.Scanner;
import java.util.Random;
public class HighLow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random brett = new Random();
		int correct = brett.nextInt(1000);
		System.out.println("Enter a number 0-1000.");
		int num = input.nextInt();
		int tries = 1;
		do
		{
			
			if (num < correct)
			{
				System.out.println("Higher!");
				System.out.println(" ");
				tries ++;
				System.out.println("Enter a number.");
				num = input.nextInt();
			}
			if (num > correct)
			{
				System.out.println("Lower!");
				System.out.println(" ");
				tries ++;
				System.out.println("Enter a number.");
				num = input.nextInt();
			}
				
		}while (num != correct);
		
		System.out.println("You win!");
		System.out.println(" ");
		System.out.println("It took you " + tries + " tries.");

	}

}
