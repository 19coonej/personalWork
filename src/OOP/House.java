package OOP;
import java.util.Scanner;
public class House {
	public House() {
		
	}
public void paintWall() {
	Scanner input = new Scanner(System.in);
	System.out.println("What is the length of the wall?");
	int length = input.nextInt();
	System.out.println("What is the height of the wall?");
	int height = input.nextInt();
	int area = length * height;
	
}
	

}
