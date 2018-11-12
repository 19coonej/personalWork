package random;

import java.util.Random;

public class Yahtzee {

	public static void main(String[] args) {
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int counter = 1;
		Random generator = new Random();
	while(ones != 5 || twos != 5 || threes != 5 || fours != 5 ||fives != 5 || sixes != 5){
		for (counter = 1; counter <= 5; counter++) {

			int max = 6;
			int min = 1;
			int randomNum = generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				ones++;
			}
			if (randomNum == 2) {
				twos++;
			}
			if (randomNum == 3) {
				threes++;
			}
			if (randomNum == 4) {
				fours++;
			}
			if (randomNum == 5) {
				fives++;
			}
			if (randomNum == 6) {
				sixes++;
			}

		
		}
	}
			System.out.println("Yahtzee!");
		}	}


