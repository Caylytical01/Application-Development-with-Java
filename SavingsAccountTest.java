//Exercise 8.6 Savings Account Test
// Kiauna Newman

/*Write a program to test class SavingsAccount.
 *  Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 
 *  and $3000.00, respectively. 
 *  Set annualInterestRate to 4%, 
 *  then calculate the monthly interest for each of 12 months 
 *  and print the new balances for both savers. 
 *  Next, set the annualInterestRate to 5%, calculate the next month’s interest 
 *  and print the new balances for both savers.
 * 
 */
public class SavingsAccountTest {

	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		System.out.println("Monthly balances for one year at 0.04");
		
		System.out.println("Balances");
		
		System.out.printf("%20s%10s\n", "saver1", "saver2");
		
		System.out.printf("%-10s%10s%10s\n","Base",saver1.toString(), 
		saver2.toString());
        
        for ( int month = 1; month <= 12; ++month ) 
        {
        	saver1.calculateMonthlyInterest();
        	saver2.calculateMonthlyInterest();
        	
        	System.out.printf ("%-10s%10s%10s\n", month, saver1.toString(),
   saver2.toString());
        	
        }
        	SavingsAccount.modifyInterestRate( .05 );
        	saver1.calculateMonthlyInterest();
        	saver2.calculateMonthlyInterest();
        	
        	System.out.println("\nAfter setting interest rate to .05");
        	
        	System.out.println("Balances");
        	
        	System.out.printf("%-10s%10s\n", "saver1", "saver2");
        	
        	System.out.printf("%-10s%10s\n",saver1.toString(),saver2.toString());
	}
}
