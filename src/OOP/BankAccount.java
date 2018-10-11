package OOP;
import java.util.Scanner;
public class BankAccount {
	double balance;
	int account;
	double rate;

	public BankAccount() {
		balance = 0.00;
		account = 000000;
		rate = 0.00;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccount() {
		return account;
	}

	public double getRate() {
		return rate;
	}

	public void setbalance(double newBalance) {
		balance = newBalance;
	}

	public void setAccount(int newAccount) {
		account = newAccount;

	}

	public void setRate(double newRate) {
		rate = newRate;
	}
	public double depositBalance(){
		Scanner input = new Scanner(System.in);
		System.out.println("How much would you like to deposit?");
		balance = balance + input.nextInt();
		System.out.println("Your new balance is:");
		return balance;
	}
	public double withdrawBalance(){
		Scanner input = new Scanner(System.in);
		System.out.println("How much would you like to withdraw?");
		balance = balance - input.nextInt();
		System.out.println("Your new balance is:");
		return balance;
	}
	public double interestBalance(){
	balance = (balance * ((rate/100) + 1));
	return balance;
}
	public double chargeBalance(){
		Scanner input = new Scanner(System.in);
		System.out.println("How much did your purchase cost?");
		balance = balance - input.nextInt();
		System.out.println("Your new balance is:");
		return balance;
	}
}
