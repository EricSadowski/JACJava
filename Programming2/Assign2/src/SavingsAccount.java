//Eric Sadowski 2338165
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SavingsAccount {

	double balance;
	double interestRate;
	double wTotal;
	double dTotal;
	double intTotal;
	
	
	public double totalDep(double dep) {
		dTotal = dTotal + dep;
		return dTotal;
	}
	
	public double totalWith(double with) {
		wTotal = wTotal + with;
		return wTotal;
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", interestRate=" + interestRate + "]";
	}

	public SavingsAccount(double balance, double interestRate) {
		
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double addInt() {
		double monthlyInt = (interestRate/12) * 0.01;
		double amt = balance * monthlyInt;
		balance = balance + amt;
		intTotal += amt;
		return balance;
		
		
	}
	
	public double withdrawal(double amount) {
		balance = balance - amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}




	public static void main(String[] args) throws FileNotFoundException {
		
		SavingsAccount account = new SavingsAccount(0, 0);
		
		//account.deposit(400);
		//account.withdrawal(100);
		//System.out.println(account);
		//account.addInt();
		//System.out.println(account);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to MTL Banking");
		System.out.println("Please make a starting deposit");
		account.setBalance(input.nextDouble());
		System.out.println("What is your interest rate?");
		account.setInterestRate(input.nextDouble());
		System.out.printf("Welcome! Current balance is : %.2f$%n", account.balance);
		
		
		//for months!!
		
		for(int i = 0; i < 12; i++) {
			
			System.out.println("Make a deposit this month?");
			double currentDep = input.nextDouble();
			account.deposit(currentDep);
			account.totalDep(currentDep);
			
			System.out.println("Make a withdrawal this month?");
			double currentWith = input.nextDouble();
			account.withdrawal(currentWith);
			account.totalWith(currentWith);
			
			account.addInt();
			System.out.printf("Balance this month is : %.2f$%n", account.balance);
			//System.out.println("Thank you, current total is " + account.balance + ", see you next month!");
			
			
		}System.out.printf("Final balance after 12 months is : %.2f$%n", account.balance);
		System.out.printf("Final deposits after 12 months is : %.2f$%n", account.dTotal);
		System.out.printf("Final withdrawals after 12 months is : %.2f$%n", account.wTotal);
		
		
		input.close();
		
	}

}
