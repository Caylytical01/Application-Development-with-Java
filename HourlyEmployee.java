// Exercise 10.16
// Kiauna Newman
/**
It’s possible to include the functionality of the 
 payroll application (Figs. 10.4 - 10.9 of your textbook)
 in the accounts payable application 
 without modifying Employeesubclasses SalariedEmployee, 
 HourlyEmployee, CommissionEmployee or BasePlusCommissionEmployee. 
 To do so, you can modify class Employee (Fig. 10.4) 
 to implement interface Payable and declare method 
 getPaymentAmount to invoke method earnings. 
 Method getPaymentAmount would then be inherited 
 by the subclasses in the Employee hierarchy. 
 When getPaymentAmount is called for a particular subclass object, 
 it polymorphically invokes the appropriate earnings 
 method for that subclass. 
 Reimplement Exercise 10.15 using the original 
 Employee hierarchy from the payroll application of Figs. 10.4–10.9.
  Modify class Employee as described in this exercise, 
  and do not modify any of class Employee’s subclasses.
 */
public class HourlyEmployee extends Employee {
	
	private double wage; // wage per hour
	   private double hours; // hours worked for week

	   // constructor
	   public HourlyEmployee(String firstName, String lastName,
	      String socialSecurityNumber, double wage, double hours)
	   {
	      super(firstName, lastName, socialSecurityNumber);

	      if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");

	      if ((hours < 0.0) || (hours > 168.0)) // validate hours
	         throw new IllegalArgumentException(
	            "Hours worked must be >= 0.0 and <= 168.0");

	      this.wage = wage;
	      this.hours = hours;
	   } 

	   // set wage
	   public void setWage(double wage)
	   {
	      if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Hourly wage must be >= 0.0");

	      this.wage = wage;
	   } 

	   // return wage
	   public double getWage()
	   {
	      return wage;
	   } 

	   // set hours worked
	   public void setHours(double hours)
	   {
	      if ((hours < 0.0) || (hours > 168.0)) // validate hours
	         throw new IllegalArgumentException(
	            "Hours worked must be >= 0.0 and <= 168.0");

	      this.hours = hours;
	   } 

	   // return hours worked
	   public double getHours()
	   {
	      return hours;
	   } 

	   // calculate earnings; override abstract method earnings in Employee
	   @Override                                                           
	   public double earnings()                                            
	   {                                                                   
	      if (getHours() <= 40) // no overtime                           
	         return getWage() * getHours();                                
	      else                                                             
	         return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	   }                                          

	   // return String representation of HourlyEmployee object              
	   @Override                                                             
	   public String toString()                                              
	   {                                                                     
	      return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
	         super.toString(), "hourly wage", getWage(),                     
	         "hours worked", getHours());                                   
	   }                                    
	} // end class HourlyEmployee


