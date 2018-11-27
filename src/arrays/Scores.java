package arrays;
import java.util.Scanner;
public class Scores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] scores = new int[5];
		int sum = 0;
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println("Enter a test score.");
			scores[i] = input.nextInt();
		}
		for (int i = 4; i >= 0; i--)
		{
			System.out.println(scores[i]);
		}
		
	}

}
