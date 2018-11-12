package random;
import java.util.Random;
public class ac1 {

	public static void main(String[] args) {
		int times = 0;
		int times2 = 0;
		for (int counter = 1; counter <= 100000; counter++)
		{
			Random generator = new Random();
			int heads = 1;
			int tails = 2;
			int randomNum = heads + generator.nextInt(tails - heads + 1);
			if (randomNum == 1)
			{
				times2 ++;
			}
			else
			{
				times ++;
			}
		}
System.out.println("Tails was flipped " + times + " times.");
System.out.println("Heads was flipped " + times2 + " times.");
	}

}
