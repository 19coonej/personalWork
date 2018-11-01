import java.util.Scanner;

public class DoW {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = input.nextInt();
		do {

			System.out.println("Magic product is " + num * 17);
			System.out.println("Please enter a number.");
			num = input.nextInt();

		} while (num != 9999);

	}

}
