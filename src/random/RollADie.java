package random;
import java.util.Random;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int min = 1;
		System.out.println("How many sides on the die?");
		int max = input.nextInt();
		System.out.println("How many rolls?");
		int rolls = input.nextInt();
		for (int counter = 1; counter <= rolls; counter++)
		{
			int randomNum = min + generator.nextInt(max - min + 1);
			System.out.println(randomNum);
		}
		

	}

}
