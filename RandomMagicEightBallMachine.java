package assignments;

import java.util.Random;

public class RandomMagicEightBallMachine {
	
	public static void main ( String[] args )
	{
		Random r = new Random();

		int choice = 1 + r.nextInt(15);
		String response = "";

		if ( choice == 1 )
			response = "Yes";
		else if ( choice == 2 )
			response = "No";
		else if ( choice == 3 )
			response = "Maybe";
		else if ( choice == 4 )
			response = "Hard to tell";
		else if ( choice == 5 )
			response = "Uh";
		else if ( choice == 6 )
			response = "As I see it, yes";
		else if ( choice == 7 )
			response = "Most likely";
		else if ( choice == 8 )
			response = "Outlook good";
		else if ( choice == 9 )
			response = "Signs point to yes";
		else if ( choice == 10 )
			response = "If you think";
		else if ( choice == 11 )
			response = "Reply hazy, try again";
		else if ( choice == 12 )
			response = "Ask again later";
		else if ( choice == 13 )
			response = "Better not tell you now";
		else if ( choice == 14 )
			response = "Cannot predict now";
		else if ( choice == 15 )
			response = "Concentrate and ask again";
		else 
			response = "Re-do!";

		System.out.println( "MAGIC 8-BALL SAYS: " + response );
	}

}
