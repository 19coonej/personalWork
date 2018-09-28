package mathOperators;
import java.util.Scanner;
public class SongsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		double realMin = -999;
		double realSec = -999;
		double realMins = -999;
		double realSecs = -999;
		double totalMin = -999;
		double totalSec = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How many songs are there?");
		double songs = input.nextDouble();
		System.out.println("What is the minute.second total?");
		double total = input.nextDouble();
		totalMin = total/1;
		realMin = totalMin/songs;
		totalSec = (total-realMin)%1;
		realSec = totalSec/songs;
		realMins = (int)realMin;
		realSecs = (int)realSec;
		System.out.println("Avg Min: " + realMins);
		System.out.println("Avg Sec: " + realSecs);
	

	}}
