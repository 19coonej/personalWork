package OOP;

public class TestBank {

	public static void main(String[] args) {
		BankAccount bob = new BankAccount();
		System.out.println("Your account balance is: " + bob.getBalance());
		System.out.println("Your account number is: " + bob.getAccount());
		System.out.println("The interest rate is: " + bob.getRate());
		bob.setbalance(500.67);
		bob.setAccount(567845);
		System.out.println("Your account balance is: " + bob.getBalance());
		System.out.println("Your account number is: " + bob.getAccount());
		bob.setRate(18.00);
		System.out.println("The interest rate is: " + bob.getRate());
		System.out.println("After deposit. you new balance is: " + bob.depositBalance());
		System.out.println("After withdrawal. you new balance is: " + bob.withdrawBalance());
		System.out.println("After interest. you new balance is: " + bob.interestBalance());
		System.out.println("After finance charge. you new balance is: " + bob.chargeBalance());
		
	}

}
