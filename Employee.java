//Kiauna Newman
//Exercise 10.16
 /* 
 *It’s possible to include the functionality of the payroll application
 * (Figs. 10.4 - 10.9 of your textbook) in the accounts payable
 *  application without modifying Employeesubclasses SalariedEmployee, 
 *  HourlyEmployee, CommissionEmployee or BasePlusCommissionEmployee. 
 *  
 *  To do so, you can modify class Employee (Fig. 10.4) 
 *  to implement interface Payable and declare method getPaymentAmount 
 *  to invoke method earnings. 
 *  Method getPaymentAmount would then be inherited by 
 *  the subclasses in the Employee hierarchy. 
 *  When getPaymentAmount is called for a particular subclass object, 
 *  it polymorphically invokes the appropriate earnings method for that
 *   subclass. 
 *   Reimplement Exercise 10.15 using the original 
 *   Employee hierarchy from the payroll application of Figs. 10.4–10.9.
 *    Modify class Employee as described in this exercise, 
 *    and do not modify any of class Employee’s subclasses.
 * 
 * 
 * 
 */

public abstract class Employee implements Payable {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
		
		// constructor
	 public Employee( String firstName, String lastName, String socialSecurityNumber )
	 {
		 this.firstName = firstName;                                    
	     this.lastName = lastName;                                    
	     this.socialSecurityNumber = socialSecurityNumber;         
	      
	   } // end constructor 

	   // return first name
	   public String getFirstName()
	   {
	      return firstName;
	   }

	   // return last name
	   public String getLastName()
	   {
	      return lastName;
	   }

	   // return social security number
	   public String getSocialSecurityNumber()
	   {
	      return socialSecurityNumber;
	   } 

	// return String representation of Employee object
	   @Override
	   public String toString()
	   {
	      return String.format("%s %s%nsocial security number: %s", 
	         getFirstName(), getLastName(), getSocialSecurityNumber());
	   } 
	   public double getPaymentAmount()
	   {
		   return earnings();
	   }
	   
	   public abstract double earnings();
   
}
