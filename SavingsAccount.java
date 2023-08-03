//Exercise 8.6 Savings Account Class
//Kiauna Newman

/*Create class SavingsAccount.
 * Use a static variable annualInterestRate
 * to store the annual interest rate for all account holders.
 * Each object of the class contains 
 * a private instance variable savingsBalance
 * indicating the amount the saver currently has on deposit. 
 * Provide method calculateMonthlyInterest 
 * to calculate the monthly interest by multiplying the
 * savingsBalance by annualInterestRate divided by 12
 * this interest should be added to savings-Balance.
 * Provide a static method modifyInterestRate 
 * that sets the annualInterestRate to a new value.
 */

public class SavingsAccount {
	private static double annualInterestRate = 0;
	private double savingsBalance;
	
	public SavingsAccount(double balance)
	{
		savingsBalance = balance;
		
	}
	
	public void calculateMonthlyInterest()
	{
		savingsBalance += savingsBalance * (annualInterestRate/12.0);
	}
	
	public static void modifyInterestRate (double newRate)
	{
		annualInterestRate = (newRate >= 0 && newRate <= 1.0)
				?newRate : 0.04;
	}
	 public String toString()
	 {
		 return String.format("$%.2f",savingsBalance);
	 }
}
	
