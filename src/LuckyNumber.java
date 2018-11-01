import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("What is your age?");
	double age = input.nextDouble();
	if (age >= 18)
	{
		System.out.println("What is your height in inches?");
		double height = input.nextDouble() * 5;
		System.out.println("Your lucky number is: " + height);
		
	}
	else
	{
		System.out.println("What is your weight in pounds?");
		double weight = input.nextDouble()*2;
		System.out.println("Your lucky number is: " + weight);
	}
	
	

	}

}
