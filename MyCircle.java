//Exercise 6.
// Kiauna Newman
/*Write a class called MyCircle 
 * that defines a method called calculateArea 
 * to calculate the area of the circle. 
 * Define a constructor that takes 
 * in one parameter to initialize an instance variable 
 * that hold the value of radius. 
 */

import java.util.Scanner;

public class MyCircle {

	public void areaOfCircle()
	{
		double radius;
		double area;
		
		Scanner input =new Scanner (System.in);
		
		System.out.println("Enter the radius: ");
		radius = input.nextDouble();
		area = calculateArea(radius);
		System.out.printf("The area of the circle is: %.2f", area);
	}
	private double calculateArea(double radius) 
	{
		return 314*radius*radius;
	}
}	
