import java.util.Scanner;
public class WhileStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = input.nextInt();
		while (num != 9999)
		{
			
			num = num * 2;
			System.out.println("Your number times two is: " + num);
			System.out.println("Please enter a number.");
			num = input.nextInt();
			
		}
		
		

	}

}
