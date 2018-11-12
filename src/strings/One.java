package strings;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		 
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("What is your age?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Your age is: " + age);
		System.out.println("Your name is: " + name);
		*/
		
		/*
		System.out.println("Type a sentence.");
		String sent = input.nextLine();
		System.out.println("The third letter is: " + sent.charAt(2));
		System.out.println("The first letter is: " + sent.charAt(0));
		System.out.println("The sentence is: " + sent);
		*/
		
		/*
		System.out.println("Type a sentence.");
		String sent = input.nextLine();
		System.out.println("It is " + sent.contains("Bob") + " that the sentance says Bob.");
		*/
		
		System.out.println("Enter a name.");
		String nameOne = input.nextLine();
		System.out.println("Enter another name.");
		String nameTwo = input.nextLine();
		int answ = nameOne.compareTo(nameTwo);
		if (answ < 0)
		{
			System.out.println(nameOne);
		}
		if (answ > 0)
		{
			System.out.println(nameTwo);
		}
		if (answ == 0)
		{
			System.out.println("The names are the same.");
		}
	}

}
