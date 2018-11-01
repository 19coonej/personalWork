package outputExamples;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number.");
		int number = input.nextInt();
		int counter = 2;
		int see = 1;
		for (counter = 2; counter < number; counter++)
		{
			see = number % counter;
			if (see == 0)
			{
				System.out.println("The number is not prime.");
				counter = number;
			
			}
			if (see != 0)
			{
				if (counter == number -1)
				{
					System.out.println("The number is prime.");
				}
			}
 
			
				
			}
	
		}
		

	}


/*if (number%counter != 0)
{
	System.out.println("The number is prime.");
	counter = 
}
else
{
	System.out.println("The number is not prime.");
	counter = number; */