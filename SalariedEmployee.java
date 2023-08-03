// Kiauna Newman
// Exercise 10.16


/**
 * It’s possible to include the functionality 
 * of the payroll application (Figs. 10.4 - 10.9 of your textbook) 
 * in the accounts payable application without modifying 
 * Employeesubclasses SalariedEmployee, HourlyEmployee, 
 * CommissionEmployee or BasePlusCommissionEmployee. 
 * To do so, you can modify class Employee (Fig. 10.4) 
 * to implement interface Payable and declare method getPaymentAmount
 *  to invoke method earnings. 
 *  Method getPaymentAmount would then be inherited by 
 *  the subclasses in the Employee hierarchy. 
 *  When getPaymentAmount is called for a particular subclass object, 
 *  it polymorphically invokes the appropriate earnings 
 *  method for that subclass. 
 *  Reimplement Exercise 10.15 using the original
 *   Employee hierarchy from the payroll application of Figs. 10.4–10.9. 
 *   Modify class Employee as described in this exercise, 
 *   and do not modify any of class Employee’s subclasses.
 * 
 */


public class SalariedEmployee extends Employee{
	private double weeklySalary;

	   // constructor
	   public SalariedEmployee(String firstName, String lastName, 
	      String socialSecurityNumber, double weeklySalary)
	   {
	      super(firstName, lastName, socialSecurityNumber); 

	      if (weeklySalary < 0.0)
	         throw new IllegalArgumentException(
	            "Weekly salary must be >= 0.0");

	      this.weeklySalary = weeklySalary;
	   } 

	   // set salary
	   public void setWeeklySalary(double weeklySalary)
	   {
	      if (weeklySalary < 0.0)
	         throw new IllegalArgumentException(
	            "Weekly salary must be >= 0.0");

	      this.weeklySalary = weeklySalary;
	   } 

	   // return salary
	   public double getWeeklySalary()
	   {
	      return weeklySalary;
	   } 

	   // calculate earnings; implement interface Payable method that was
	   // abstract in superclass Employee                                
	   @Override                                                         
	   public double earnings()                                  
	   {                                                                 
	      return getWeeklySalary();                                      
	   } 

	   // return String representation of SalariedEmployee object   
	   @Override                                                    
	   public String toString()                                     
	   {                                                            
	      return String.format("salaried employee: %s%n%s: $%,.2f",
	         super.toString(), "weekly salary", getWeeklySalary());
	   }
	
}
