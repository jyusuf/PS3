package MainPackage;
import java.util.Date;



public class AccountTestClass {
	
	public static void main(String[] args) {
		
		
		Account a = new Account(1122 , 20000 , 0.045);
		a.withdraw(2500.00);
		a.deposit(3000.00);
		Date dateCreated = new Date();
		System.out.println("The total balance is $" + a.getBalance());
		System.out.println("Your monthly interest is $" + a.getMonthlyInterestRate());
		System.out.println("This account was created on " + dateCreated.toString());
		
	}		
	}



