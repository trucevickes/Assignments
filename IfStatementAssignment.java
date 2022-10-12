package assignments;

public class IfStatementAssignment {
	
	public static void main( String[] args )
	{
		int mice = 50;
		int cats = 30;
		int dogs = 15;

		if ( mice < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( mice > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( mice < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( mice > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( mice >= dogs )
		{
			System.out.println( "Mice are greater than or equal to dogs." );
		}

		if ( mice <= dogs )
		{
			System.out.println( "Mice are less than or equal to dogs." );
		}

		if ( mice == dogs )
		{
			System.out.println( "Mice are dogs." );
		}
	}

}
