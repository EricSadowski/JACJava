// Eric Sadowski  2338165
public class SavingsAccount extends BankAccount{
	
	boolean active;

	public SavingsAccount(double balance, double annualInt) {
		super(balance, annualInt);
		if(balance < 25) {
			active = false;
		}else {
			active = true;
		}
	}
	
	@Override
	public void withdrawal(double amount) {
		
		if(!active) {
			System.out.println("Account is below minimum, Cannot Withdraw Funds");
		}else
		
			super.withdrawal(amount);
		if(balance < 25) {
			active = false;
		}
	}
	
	
	@Override
	public void deposit(double amount) {
		
		if(!active) {
			System.out.println("Account is below minimum, Please Deposit Funds");
			super.deposit(amount);
			if(balance >= 25) {
				active = true;
			}
		}else
		
			super.deposit(amount);
	}
	
	@Override
	public void monthlyProcess() {
		if(nWith > 4) {
			sCharge += nWith - 4;
		}
		if(balance < 25) {
			System.out.println("Account is below minimum and now inactive, please deposit money to reactivate");
			balance -= sCharge;
			nDeposits = 0;
			nWith = 0;
		}
		else if(balance-sCharge<25) {
			System.out.println("Account is below minimum and now inactive, please deposit money to reactivate");
			balance -= sCharge;
			nDeposits = 0;
			nWith = 0;
		}else {
			super.monthlyProcess();
		}
		
	}
	
	
	public static void main(String[] args) {

		SavingsAccount joe = new SavingsAccount(20, 4);
		joe.sCharge = 3.50;
		joe.deposit(20);
		joe.withdrawal(1);
		joe.withdrawal(20);
		joe.monthlyProcess();
		
		
		System.out.println(joe);
		System.out.print("Balance: $");
		System.out.printf("%.2f%n", joe.getBalance());
		
		SavingsAccount bill = new SavingsAccount(1003, 5);
		bill.sCharge = 3;
		bill.deposit(20);
		bill.withdrawal(1);
		
		
		
		
		System.out.println(bill);
		System.out.print("Balance: $");
		System.out.printf("%.2f%n", bill.getBalance());
		
		
		
		
		
	}

	
	
	@Override
	public String toString() {
		return "Is the Savings account active? : " + active + ", current number of deposits: " + nDeposits + ","
				+ " current number of withdrawals: "
				+ nWith + ", annual interest rate: " + annualInt + "%, services charges: " + sCharge;
	}
	
	
	
	
}
