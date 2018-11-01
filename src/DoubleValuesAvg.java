import java.util.Scanner;
public class DoubleValuesAvg {

	public static void main(String[] args) {
		double numnum= 1;
		double sum = 0;
		double avg = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the num u want dawg?");
		double num = input.nextDouble();
		while (num < 9999)
		{
			
			sum = sum + num;
			avg = sum / numnum;
			System.out.println("Enter another number.");
			num = input.nextDouble();
			numnum++;
			
			
		}
		System.out.println(avg);
			

	}

}
