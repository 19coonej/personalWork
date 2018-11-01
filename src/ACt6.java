import java.util.Scanner;
public class ACt6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int counter = 1;
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		sum = num;
		for(counter = 1; counter <= 4; counter = counter +1)
		{
			
			System.out.println("Enter a number: ");
			num = input.nextInt();
			sum = num + sum;
			
		}
		System.out.println(sum);
		

	}

}
