package OOP;

public abstract class TestClassWage {

	public static void main(String[] args) {
		Employee brett = new Employee();
		System.out.println(brett.getWage());
		brett.setWage(8.25);
		System.out.println(brett.getWage());
		System.out.println(brett.getExp());
		brett.setExp(2);
		System.out.println(brett.getExp());
		brett.wageInc();
		System.out.println(brett.getWage());
	}

}
