import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp = input.nextInt();
		if (temp > 83) {
			System.out.println("Swimming");
		} else {
			if (temp > 74 && temp <= 83) {
				System.out.println("Tennis");
			} else {
				if (temp > 35 && temp <= 74) {
					System.out.println("Golf.");
				} else {
					if (temp > -10 && temp <= 350) {
						System.out.println("Snow Shoeing.");
					} else {
						System.out.println("Nothing");
					}
				}
			}
		}

	}

}
