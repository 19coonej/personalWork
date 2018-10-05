package OOP;

public class Numbers {
public Numbers() {	
}
public void sayNumber(double num) {
	System.out.println("Your number is: " + num);
}
public void sayNumberTwo(double num) {
	System.out.println("Your number is: " + (num + 2));
}
public void sayNum(double num, double num2) {
	System.out.println("Your number is: " + (num + num2));
	
}
public double returnArea(double length, double width) {
	return length * width;	
}
public int returnRoundUp(double weiner) {
	int rounded = (int)Math.ceil(weiner);
	return rounded;
	
}

}
