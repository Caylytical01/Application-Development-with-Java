 // Exercise 4.21 Largest Number
// Kiauna Newman

    /*pseudcode
     * set largest number to 0
     * set counter to 0
     * set number
     * prompt user to input a number 10 times
     * input number 
     * 
     * if number > largest
     * largest = number
     * counter = counter +1 
     * print largest
 */
   
   /* java syntax to use
    * use scanner to get input
    * declare variables
    * use counter controlled repetition
    * increment counter
    * use systems.printf to print output
   */

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int number;
		int largest = 0;
		
		while (counter < 10)
		{//begin while
			
			System.out.println("Please enter 10 numbers: "); 
		    number = input.nextInt();
		    
		    if (number > largest) 
		    {
		    	largest = number;
		    	counter = counter+1;
		    }			
			
		}//end while
		
		System.out.printf("The largest number is: %d", largest);
	}
}
