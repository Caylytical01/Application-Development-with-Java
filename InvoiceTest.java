import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) 
	
	{
		Invoice invoice1 = new Invoice("01234", "Wood", 1, 5.95);
	    
	    System.out.printf( "part number: %s\n", invoice1.getpartNo() );
	    System.out.printf( "part description: %s\n", invoice1.getpartDesc());
	    System.out.printf( "quanity: %d\n", invoice1.getquanity());
	    System.out.printf( "price: $%.2f%n", invoice1.getprice());
	    System.out.printf( "invoice amount: $%.2f%n",invoice1.getInvoiceAmount());
	}
	    
	    

	}
