package OOP;

public class TestWorker {

	public static void main(String[] args) {
		Worker brett = new Worker();
		System.out.println("The number of hours worked is: " + brett.getHours());
		System.out.println("The wage is: " + brett.getWage());
		brett.setHours(5);
		brett.setWage(6.50);
		System.out.println("The number of hours worked is: " + brett.getHours());
		System.out.println("The wage is: " + brett.getWage());
		System.out.println("The pay check is: " + brett.payCheck());
		System.out.println("The new wage is: " + brett.raise());

	}

}
