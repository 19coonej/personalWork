import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double epsilon = .01;
double root = Math.sqrt(84.3);
System.out.println("How much money did you receive for you fifth birthday");
double money = input.nextDouble();
if (Math.abs(root - money) < epsilon)
{
	System.out.println("You win a good prize.");
}
else
{
	System.out.println("You win a bad prize.");
}
	
	}

}
