package outputExamples;
import java.util.Scanner;
public class Grind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner input = new Scanner(System.in);
		/* System.out.println("Enter a number.");
 int num = input.nextInt();
 int sum = num;
 int times = 1;
 do
 {
	 System.out.println("Enter a number.");
	 num = input.nextInt();
	 sum = sum + num;
	 times++;
 }while (sum < 2018);
	
System.out.println("You entered this many numbers: " + times);
*/
		/*System.out.println("Enter a 3 digit positive number.");
		int num = input.nextInt();
		if (num%2 != 0)
		{
			num = num +1;
		}
		else
		{
			num = num;
		}
		int sum = 0;
		int counter = 1;
		for (num = num; num <= 1000; num = num + 2)
		{
			sum = sum + num;
		}
		System.out.println(sum); */
		
		System.out.println("Enter a positive integer.");
		int num = input.nextInt();
		int counter = 1;
		int divisors = 0;
		int mostDivisors = 0;
		for (counter = 1; counter <= num; counter++)
		{
			for (num = num; num > 0; num = num -1)
			{
				num = num -1;
				if (num % counter == 0)
				{
					divisors ++;
				}
				else
				{
					divisors = divisors;
				}
				
			if (divisors > mostDivisors)
			{
				num = mostDivisors;
			}
				
			}
			
				
				
		}
		System.out.println(num);
		
}
}

