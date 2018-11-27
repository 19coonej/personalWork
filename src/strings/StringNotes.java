package strings;

import java.util.Scanner;

public class StringNotes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 
		 * System.out.println("Enter a sentence."); String sent =
		 * input.nextLine(); System.out.println(sent.indexOf('X'));
		 */
		/*
		 * System.out.println("Enter a sentence."); String sent =
		 * input.nextLine(); System.out.println(sent.length());
		 */
		/*
		 * System.out.println("Enter a sentence."); String sent =
		 * input.nextLine(); int aye = 0; for (int counter = 1; counter <=
		 * sent.length(); counter++) {
		 * 
		 * System.out.println(sent.charAt(aye)); aye++;
		 */
/*
		String text = "My name is Buzz Lightyear!";
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.substring(i));

		}
		*/
		/*
		System.out.println("Enter a sentence.");
		String sent = input.nextLine();
		System.out.println(sent.toLowerCase());
		System.out.println(sent);
		*/
		/*
		System.out.println("Enter a name.");
		String nameOne = input.nextLine();
		System.out.println("Enter another name.");
		String nameTwo = input.nextLine();
		if (nameOne.compareTo(nameTwo) < 0)
		{
			System.out.println(nameOne.toUpperCase());
		}
		if (nameOne.compareTo(nameTwo) > 0)
		{
			System.out.println(nameTwo.toUpperCase());
		}
		if (nameOne.compareTo(nameTwo) == 0)
		{
			System.out.println("The names are the same.");
		}
		*/
		/*
		System.out.println("Enter a password.");
		String pass = input.nextLine();
		System.out.println("Verify password.");
		String passV = input.nextLine();
		while(pass.compareTo(passV) != 0)
		{
			System.out.println("Verify password.");
			passV = input.nextLine();
		}
		System.out.println("You are ready to login.");
		*/
		
		/*
		System.out.println("Verify password.");
		String sent = input.nextLine();
		for (int i = 0; i < sent.length(); i = i + 4)
		{
				System.out.println(sent.charAt(i));
		}
		*/
		System.out.println("Enter your SSN.");
		String ssn = input.nextLine();
		System.out.println(ssn.substring(5));
		System.out.println(ssn.substring(3,5));
		System.out.println(ssn.substring(0,3));
		
		
	}
	

}
