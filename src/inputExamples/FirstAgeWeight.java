package inputExamples;
import java.util.Scanner;
public class FirstAgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your age in years?");
age = input.nextInt();
System.out.println("Your age is: " + age + " years");
System.out.println("");
double weight = 0.0;
System.out.println("What is your weight in pounds?");
weight = input.nextDouble();
System.out.println("Your weight is: "+ weight + " pounds");

	}

}
