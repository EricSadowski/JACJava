//Eric Sadowski 2338165
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankFile extends SavingsAccount {

	
	
	
	
	public BankFile(double balance, double interestRate) {
		super(balance, interestRate);
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		//creating a new account object
		SavingsAccount joe = new SavingsAccount(500, 2);

		Scanner input = new Scanner(System.in);
		
try {
		//reading the files an using methods from other class to deposit them
		File deposit = new File("Deposits.txt");
		Scanner inputFile = new Scanner(deposit);
		joe.deposit(inputFile.nextDouble());
		joe.deposit(inputFile.nextDouble());
		joe.deposit(inputFile.nextDouble());
		joe.deposit(inputFile.nextDouble());
		
		File with = new File("Withdrawals.txt");
		Scanner wFile = new Scanner(with);
		joe.withdrawal(wFile.nextDouble());
		joe.withdrawal(wFile.nextDouble());
		joe.withdrawal(wFile.nextDouble());
		joe.withdrawal(wFile.nextDouble());
		joe.withdrawal(wFile.nextDouble());
		
		//adding interest and displaying monthly total
		joe.addInt();
		System.out.printf("Total Interest : %.2f$%n", joe.intTotal);
		System.out.printf("Current balance is : %.2f$%n", joe.balance);
		
		
		wFile.close();
		inputFile.close();	
		input.close();



}catch(Exception e) {
	System.out.println(e);
}


}

}
