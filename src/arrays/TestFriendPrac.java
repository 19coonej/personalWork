package arrays;
import java.util.Scanner;
public class TestFriendPrac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends?");
		int numFriend = input.nextInt();
		Friend[] bob = new Friend[numFriend];
		for (int i = 0; i < numFriend; i++)
		{
			System.out.println("What age is this friend?");
			int age = input.nextInt();
			input.nextLine();
			System.out.println("What is the name of this friend?");
			String name = input.nextLine();
			bob[i] = new Friend(name, age);
		}
		for (int z = numFriend - 1; z >= 0; z--)
		{
			System.out.println(bob[z].getName() + bob[z].getAge());
		}
	}

}
