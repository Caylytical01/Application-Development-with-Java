// Kiauna Newman
// Exercise 10.16

/**
It�s possible to include the functionality of the 
payroll application (Figs. 10.4 - 10.9 of your textbook) 
in the accounts payable application without modifying 
Employeesubclasses SalariedEmployee, HourlyEmployee,
 CommissionEmployee or BasePlusCommissionEmployee. 
 To do so, you can modify class Employee (Fig. 10.4) 
 to implement interface Payable and declare method getPaymentAmount
  to invoke method earnings. 
  Method getPaymentAmount would then be inherited by the
   subclasses in the Employee hierarchy. 
   When getPaymentAmount is called for a particular subclass object, 
   it polymorphically invokes the appropriate earnings
    method for that subclass. 
    Reimplement Exercise 10.15 using the original 
    Employee hierarchy from the payroll application of 
    Figs. 10.4�10.9. 
    Modify class Employee as described in this exercise, 
    and do not modify any of class Employee�s subclasses.
 * 
 */

public class PayrollSystemTest 
{
	 public static void main(String[] args) 
	   {
	      // create subclass objects
	      SalariedEmployee salariedEmployee = 
	         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
	      HourlyEmployee hourlyEmployee = 
	         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
	      CommissionEmployee commissionEmployee = 
	         new CommissionEmployee(
	         "Sue", "Jones", "333-33-3333", 10000, .06);
	      BasePlusCommissionEmployee basePlusCommissionEmployee = 
	         new BasePlusCommissionEmployee(
	         "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

	      System.out.println("Employees processed individually:");
	      
	      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
	         salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
	      
	      System.out.printf("%s%n%s: $%,.2f%n%n",
	         hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
	      
	      System.out.printf("%s%n%s: $%,.2f%n%n",
	         commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
	      System.out.printf("%s%n%s: $%,.2f%n%n", 
	         basePlusCommissionEmployee, 
	         "earned", basePlusCommissionEmployee.getPaymentAmount());

	      // create four-element Employee array
	      Employee[] employees = new Employee[4]; 

	      // initialize array with Employees
	      employees[0] = salariedEmployee;
	      employees[1] = hourlyEmployee;
	      employees[2] = commissionEmployee; 
	      employees[3] = basePlusCommissionEmployee;

	      System.out.printf("Employees processed polymorphically by calling \n" + "getPaymentAmount method instead of earnings method" + ":%n%n");
	      
	      // generically process each element in array employees
	      for (Employee currentEmployee : employees) 
	      {
	         System.out.println(currentEmployee); // invokes toString

	         // determine whether element is a BasePlusCommissionEmployee
	         if (currentEmployee instanceof BasePlusCommissionEmployee) 
	         {
	            // downcast Employee reference to 
	            // BasePlusCommissionEmployee reference
	            BasePlusCommissionEmployee employee = 
	               (BasePlusCommissionEmployee) currentEmployee;

	            employee.setBaseSalary(1.10 * employee.getBaseSalary());

	    System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
	               employee.getBaseSalary());
	         } 

	     System.out.printf(
	            "earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
	      } 

	      // get type name of each object in employees array
	      for (int j = 0; j < employees.length; j++)
	         System.out.printf("Employee %d is a %s%n", j, 
	            employees[j].getClass().getName()); 
	   } // end main
	} // end class PayrollSystemTest


