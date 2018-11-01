import java.util.Scanner;

public class LS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a test score.");
		double score = input.nextDouble();
		double biggest = score;
		double smallest = score;
		while (score != 9999) {
			if (score > biggest) {
				biggest = score;
			} else {
				if (score < smallest) {
					smallest = score;
				}
			}
			System.out.println("Enter a score. Enter 9999 to be done.");
			score = input.nextDouble();

		}
		System.out.println("The smallest test score is: " + smallest);
		System.out.println("The biggest test score is: " + biggest);
	}
}
