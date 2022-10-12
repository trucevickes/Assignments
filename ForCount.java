package assignments;

import java.util.Scanner;

public class ForCount {
	
	public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "What message do you want repeated?" );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 1 ; n <= 5 ; n = n+1 )
        {
            System.out.println( n + ". " + message );
        }
        
        System.out.println( "Another message?" );
        System.out.print( "Message: " );
        String nextmessage = keyboard.nextLine();

        for ( int n = 1 ; n <= 5 ; n = n+1 )
        {
            System.out.println( n + ". " + nextmessage );
        }
        
        System.out.println( "Third?" );
        System.out.print( "Message: " );
        String aftermessage = keyboard.nextLine();

        for ( int n = 1 ; n <= 5 ; n = n+1 )
        {
            System.out.println( n + ". " + aftermessage );
        }

    }

}
