package random;
import java.util.Random;
public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studyTotal = 0;
		int biggest = 0;
		Random generator = new Random();
for (int counter = 1; counter <= 1000000; counter++)
{
	for (int counter2 = 1; counter2 <= 100000; counter2++)
	{
		
		int heads = 1;
		int tails = 2;
		int randomNum = heads + generator.nextInt(tails - heads + 1);
		if (randomNum == 1)
		{
			heads ++;
			studyTotal++;
		}
		if (studyTotal > biggest)
		{
			biggest = studyTotal;
		}
	}
	studyTotal = 0;
}
System.out.println("The greatest percentage of heads rolled is: " + biggest / 100000);
	}

}
