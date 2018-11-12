package random;
import java.util.Random;
public class ac2 {

	public static void main(String[] args) {
		Random generator = new Random();
		int times = 0;
		for (int counter = 1; counter <=87; counter++)
		{
			int min = 1;
			int max = 13;
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum % 3 == 0)
			{
				times++;
			}
		}
		System.out.println(times);

	}
}