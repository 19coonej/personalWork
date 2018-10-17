package decisions;
import java.util.Scanner;
public class HeightAndShoe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.println("Enter your height: ");
		int height = input.nextInt();
		System.out.println("Enter your shoe size: ");	
		int shoeSize = input.nextInt();
		System.out.println(height < 62 && shoeSize > 9);
		*/
		
		/*System.out.println("Enter test score 1:");
		int testone = input.nextInt();
		System.out.println("Enter test score 2:");
		int testtwo = input.nextInt();
		if (testone > testtwo)
		{
			System.out.println("Great job!");
			System.out.println("The difference between the two scores is: " + (testone - testtwo));
		}
		System.out.println("Have a nice day!");
		*/
	
		/*int none = input.nextInt();
		int ntwo = input.nextInt();
		int nthree = input.nextInt();
		if (none > ntwo && none > nthree)
		{
			System.out.println("Largest number is: " + none);
		}
		if (ntwo > none && ntwo > nthree)
		{
			System.out.println("Largest number is: " + ntwo);
		}
		if (nthree > none && nthree > ntwo)
		{
			System.out.println("Largest number is: " + nthree);
		}
		*/
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		if (age <= 17)
		{
			System.out.println("You are getting an A in this class.");
		}
		System.out.println("Have a nice day!");
	}

}
