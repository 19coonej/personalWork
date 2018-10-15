package OOP;

public class TestClassNumbers {

	public static void main(String[] args) {
 Numbers man = new Numbers();
 man.sayNumber(7.5);
man.sayNumberTwo(36.8);
man.sayNum(5.89, 84.6);
Numbers bob = new Numbers();
double answer = bob.returnArea(5.8, 4.6);
System.out.println(answer);
int answerTwo = bob.returnRoundUp(7.3);
System.out.println(answerTwo);
	}

}
