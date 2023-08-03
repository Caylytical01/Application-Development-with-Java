// Exercise 10.16
//Kiauna Newman
/*
 * It’s possible to include the functionality of the payroll 
 * application (Figs. 10.4 - 10.9 of your textbook) 
 * in the accounts payable application without modifying
 *  Employeesubclasses SalariedEmployee, HourlyEmployee,
 *   CommissionEmployee or BasePlusCommissionEmployee. 
 *   To do so, you can modify class Employee (Fig. 10.4)
 *    to implement interface Payable and 
 *    declare method getPaymentAmount to invoke method earnings.
 *     Method getPaymentAmount would 
 *     then be inherited by the subclasses in the Employee hierarchy. 
 *     When getPaymentAmount is called for a particular subclass object, 
 *     it polymorphically invokes the appropriate earnings method for that subclass.
 *      Reimplement Exercise 10.15 using the original Employee hierarchy 
 *      from the payroll application of Figs. 10.4–10.9.
 *       Modify class Employee as described in this exercise, 
 *       and do not modify any of class Employee’s subclasses.
 */
public class CommissionEmployee extends Employee {
	
	   private double grossSales; // gross weekly sales
	   private double commissionRate; // commission percentage

	   // constructor
	   public CommissionEmployee(String firstName, String lastName, 
	      String socialSecurityNumber, double grossSales, 
	      double commissionRate)
	   {
	      super(firstName, lastName, socialSecurityNumber);

	      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate 
	         throw new IllegalArgumentException(
	            "Commission rate must be > 0.0 and < 1.0");

	      if (grossSales < 0.0) // validate
	         throw new IllegalArgumentException("Gross sales must be >= 0.0");

	      this.grossSales = grossSales;
	      this.commissionRate = commissionRate;
	   } 

	   // set gross sales amount
	   public void setGrossSales(double grossSales)
	   {
	      if (grossSales < 0.0) // validate
	         throw new IllegalArgumentException("Gross sales must be >= 0.0");

	      this.grossSales = grossSales;
	   } 

	   // return gross sales amount
	   public double getGrossSales()
	   {
	      return grossSales;
	   } 

	   // set commission rate
	   public void setCommissionRate(double commissionRate)
	   {
	      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
	         throw new IllegalArgumentException(
	            "Commission rate must be > 0.0 and < 1.0");

	      this.commissionRate = commissionRate;
	   } 

	   // return commission rate
	   public double getCommissionRate()
	   {
	      return commissionRate;
	   } 

	   // calculate earnings; override abstract method earnings in Employee
	   @Override                                                           
	   public double earnings()                                            
	   {                                                                   
	      return getCommissionRate() * getGrossSales();                    
	   }                                             

	   // return String representation of CommissionEmployee object
	   @Override                                                   
	   public String toString()                                    
	   {                                                           
	      return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",    
	         "commission employee", super.toString(),              
	         "gross sales", getGrossSales(),                       
	         "commission rate", getCommissionRate());             
	   } 
	} // end class CommissionEmployee


