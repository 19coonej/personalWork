package OOP;
import java.util.Scanner;
public class Room {

	public Room()
	{
		
	}
	
	public void area() {
		Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	int length = input.nextInt();
	System.out.println("What is the height of the wall");
	int height = input.nextInt();
	int area = length * height;
	System.out.println("The area of the wall is: " + area);
}
 public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
	 System.out.println("What is the length of the wall?");
	 int lengthTwo = input.nextInt();
	 System.out.println("What is the height of the wall?");
	 int heightTwo = input.nextInt();
	 int areaTwo = lengthTwo * heightTwo;
	 System.out.println("What is the length of the door?");
	 int lengthThree = input.nextInt();
	 System.out.println("What is the height of the door?");
	 int heightThree = input.nextInt();
	 int areaThree = lengthThree * heightThree;
	 int areaTotal = areaTwo - areaThree;
	 System.out.println("The area of the wall without the door is: " + areaTotal);
 }
 
}
