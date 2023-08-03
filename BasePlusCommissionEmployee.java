// Exercise 10.16
// Kiauna Newman

/*
 * It’s possible to include the functionality of the payroll application
 *  (Figs. 10.4 - 10.9 of your textbook) 
 *  in the accounts payable application without 
 *  modifying Employeesubclasses SalariedEmployee, 
 *  HourlyEmployee, CommissionEmployee or BasePlusCommissionEmployee.
 *  
 *   To do so, you can modify class Employee (Fig. 10.4) 
 *   to implement interface Payable and declare method getPaymentAmount 
 *   to invoke method earnings. 
 *   Method getPaymentAmount would then be inherited by the 
 *   subclasses in the Employee hierarchy. 
 *   When getPaymentAmount is called for a particular subclass object, 
 *   it polymorphically invokes the appropriate earnings method for that subclass. 
 *   Reimplement Exercise 10.15 using the original Employee hierarchy from the payroll application of Figs. 10.4–10.9.
 *    Modify class Employee as described in this exercise, and do not modify any of class Employee’s subclasses.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);                      

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate earnings
   @Override 
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s %s; %s:$%,.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary());   
   } 
} // end class BasePlusCommissionEmployee
