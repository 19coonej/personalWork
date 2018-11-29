package arrays;

import java.util.Scanner;

public class FriendNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter a name.");
			names[i] = input.nextLine();
		}
		for (int q = names.length - 1; q >= 0; q--) {
			System.out.println(names[q]);
		}
		System.out.println("Enter a letter.");
		String letter = input.nextLine();
		char aLetter = letter.charAt(0);
		for (int z = 0; z < names.length; z++) {
			int max = names[z].length();
			char last = names[z].charAt(max - 1);
			if (last == aLetter) {
				System.out.println(names[z]);
			}

		}
		System.out.println("Enter a name length.");
		int dLength = input.nextInt();
		for (int y = 0; y < names.length; y++) {
			if (names[y].length() == dLength) {
				System.out.println(names[y]);
			}
		} 
	}

}
