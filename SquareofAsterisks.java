//Exercise 6.18 Square of Asterisks
//Kiauna Newman

import java.util.Scanner;

public class SquareofAsterisks {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int size;
		
		System.out.print("Please enter size of square: ");
		 
		size = input.nextInt();
	    squareOfAsterisks(size);     
	}
	
	public static void squareOfAsterisks(int size)
	{
		for (int x=1; x <size;x++)
			
		{	for (int y=1; y<size; y++)
			
			System.out.print('*');
		 System.out.println();
		}
	        
	}

}
