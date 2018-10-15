package OOP;

public class Cat {
	private int age;
	private int sleep;

	public Cat() {
		age = 0;
		sleep = 0;
	}
	
	public Cat (int xage, int xsleep){
		xage=age;
		xsleep=sleep;
	}

	public int getAge() {
		return age;
	}

	public int getSleep() {
		return sleep;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setSleep(int newSleep) {
		sleep = newSleep;
	}

	public void birthday() {
		age = age + 1;
	}

	public int sleepMore() {
		return sleep + 3;
	}

	public int sleepLess() {
		return sleep - 3;
	}
}
