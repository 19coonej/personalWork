import java.util.Scanner;
public class AcOneFoLoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		System.out.println("What's your fav number?");
		
				int fav = input.nextInt();
		for(counter = 1; counter <= 10; counter = counter +1)
		{
			System.out.println(fav + " Hello");
		}

	}

}
