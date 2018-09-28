package mathOperators;
import java.util.Scanner;
public class PreTestSongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int realMin = -999;
		int realSec = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How many songs are there?");
		double songs = input.nextDouble();
		System.out.println("What is the minute.second total?");
		double total = input.nextDouble();
		double avgSec = total/songs;
		double totalSec = avgSec * 60;
		double min = totalSec/60;
		realMin = (int)min;
		double sec = totalSec%60;
		realSec = (int)sec;
		System.out.println("Avg Min: " + realMin);
		System.out.println("Avg Sec: " + realSec);
		
		
		
		
		
		
		
	}

}
