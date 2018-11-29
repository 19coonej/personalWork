package arrays;
import java.util.Random;
import java.util.Scanner;

public class SplitActOne {

	public static void main(String[] args) {
		int times = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		System.out.println("Enter a keyword.");
		String key = input.nextLine();
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(key) == true) {
				times++;
			}
		}
		System.out.println(times);
		int max = words.length - 1;
		int min = 0;
		Random generator = new Random();
		int randomNum = min + generator.nextInt(max - min + 1);
		System.out.println(words[randomNum]);
	}

}
