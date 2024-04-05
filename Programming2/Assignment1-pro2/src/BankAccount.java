// Eric Sadowski  2338165

abstract class BankAccount {

	double balance;
	int nDeposits;
	int nWith;
	double annualInt;
	double sCharge;

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(double balance, double annualInt) {
		
		this.balance = balance;
		this.annualInt = annualInt;
	}
	
	public void deposit(double amount) {
		balance += amount;
		nDeposits++;
	}
	
	public void withdrawal(double amount) {
		balance -= amount;
		nWith++;
	}
	
	public void calcInterest() {
		double monthlyRate = annualInt/12;
		double monthlyInt = balance * monthlyRate /100;
		balance += monthlyInt;
	}
	
	public void monthlyProcess() {
		balance -= sCharge;
		calcInterest();
		nDeposits = 0;
		nWith = 0;
		
	}


}
