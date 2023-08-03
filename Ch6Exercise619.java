/*Then, modify the method created in Exercise 6.18 of your textbook
 *  to receive a second parameter of type char called fillCharacter.
 *   Form the square using the char provided as an argument.
 *    Thus, if side is 5 and fillCharacter is #, 
 *    the method should display
 */
/*
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) 
to read a character from the user at the keyboard:
char fill = input.next().charAt(0);
*/

import java.util.Scanner;

public class Ch6Exercise619 {

	public static void main(String[] args)
	{
Scanner input = new Scanner(System.in);
		
		int size;
		char fill;
		
		System.out.print("Please enter character: ");
		 
		fill = input.next().charAt(0);
		
		System.out.print("Please enter size of square: ");
		 
		size = input.nextInt();
	    fillCharacter(size,fill);     
	}
	
	public static void fillCharacter(int size, char fill)
	{
		for (int x=1; x <size;x++)
			
		{	for (int y=1; y<size; y++)
			
			System.out.print(fill);
		 System.out.println();
		}
	        

	}

}
