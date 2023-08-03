//Exercise 5.29
// Kiauna Newman

/* lyrics to twelve days of christmas
 *
 * On the First day of Christmas my true love sent to me
 * a Partridge in a Pear Tree.
 * 
 * On the Second day of Christmas my true love sent to me
 * Two Turtle Doves and a Partridge in a Pear Tree.
 * 
 * On the Third day of Christmas my true love sent to me
 * three French Hens,Two Turtle Doves and a Partridge in a Pear Tree.
 * 
 * Subsequent verses follow the same pattern, 
 * each adding one new gift and repeating all the earlier gifts, 
 * so that each verse is one line longer than its predecessor:
 * 
 * 4 Calling Birds
 * 5 Gold Rings
 * 6 Geese a-Laying
 * 7 Swans a-Swimming
 * 8 Maids a-Milking
 * 9 Ladies Dancing
 * 10 Lords a-Leaping
 * 11 Pipers Piping
 * 12 Drummers Drumming
 */

public class TwelvedaysofChristmas
{

	public static void main(String[] args)
	{
		String lyric ="";
		for (int day = 1; day <= 12; day++)
	{ 	
		lyric += " \nOn the ";
		 
		switch (day)
		{
			case 1:
				lyric += "first";
				break;
			case 2:
				lyric += "second";
				break;
			case 3:
				lyric += "third";
				break;
			case 4:
				lyric += "fourth";
				break;
			case 5:
				lyric += "fifth";
				break;
			case 6:
				lyric += "sixth";
				break;
			case 7:
				lyric += "seventh";
				break;
			case 8:
				lyric += "eighth";
				break;
			case 9:
				lyric += "ninth";
				break;
			case 10:
				lyric += "tenth";
				break;
			case 11:
				lyric += "eleventh";
				break;
			case 12:
				lyric += "twelveth";
				break;
		  }
		
		lyric += "  day of Christmas my true love sent to me: ";
		
		switch (day)
		{
			case 12:
				lyric += " Drummers Drumming, ";
			
			case 11:
				lyric += " Eleven Pipers Piping, ";
			
			case 10:
				lyric += " Ten Lords a-Leaping, ";
			
			case 9:
				lyric += " Nine Ladies Dancing, ";
			
			case 8:
				lyric += " Eigth Maids a-Milking, ";
			
			case 7:
				lyric += " Seven Swans a-Swimming, ";
			
			case 6:
				lyric += " Six Geese a-Laying, ";
			
			case 5:
				lyric += " Five Gold Rings, ";
			
			case 4:
				lyric += " Four Calling Birds, ";
			
			case 3:
				lyric += " Three French Hens, ";
			
			case 2:
				lyric += " Two Turtle Doves, ";
			
			case 1:
				lyric += " a Partridge in a Pear Tree. ";
		}
	}
		System.out.println(lyric);
   }
}
