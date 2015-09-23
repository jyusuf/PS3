package MainPackage;
import java.util.Date;
import java.io.*;

public class Account {

	
	//attributes
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//no-arg constructor
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	//constructor
	public Account(int Id, double Balance, double AnnualInterestRate){
		this.id= Id;
		this.balance = Balance;
		this.annualInterestRate = AnnualInterestRate;
}
	
	//getter for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//getter for id
	public int getId()
	{
		return id;
	}
	
	//setter for id
	public void setId(int Id)
	{
		this.id = Id;
	}
	
	//getter for balance
	public double getBalance()
	{
		return balance;
	}
	
	//setter for balance
	public void setBalance(double Balance)
	{
		this.balance = Balance;
	}
	
	//getter for annualInterestRate
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}
	
	//setter for annualInterestRate
	public void setAnnualInterestRate(double AnnualInterestRate)
	{
		this.annualInterestRate = AnnualInterestRate;
	}
	
	//method getMonthlyInterestRate that returns the monthly interest rate.
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 12);
	}
	
	//method withdraw that withdraws a specific amount from the account
	public double withdraw(double amount) 
	
	{
		return balance -= amount;
	}
	//method deposit that deposits a specified amount to the account
	public double deposit(double amount)
	{
		return balance += amount;
	}
	
	
	}

