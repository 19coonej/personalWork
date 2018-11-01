import java.util.Scanner;
public class DoWthree {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = input.nextInt();
		int largest = num;
		do{
			
			if (num > largest)
			{
				 largest = num;
				 System.out.println("Enter a number.");
				 num = input.nextInt();
			}
			
		}while (num != 9999);
		
	}

}
