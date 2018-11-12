package random;

import java.util.Random;

public class ac3 {

	public static void main(String[] args) {
		Random generator = new Random();
		int times = 0;
		for (int counter = 1; counter <=248; counter++)
		{
			int min = 26;
			int max = 43;
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum > 36)
			{
				times++;
			}
		}
		System.out.println(times);

	}


	}


