package assignments;

import java.util.Scanner;

public class QuestionInput
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double weight;
		String inches;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you (in feet)? " );
		height = keyboard.next();
		
		System.out.print( "and inches? " );
		inches = keyboard.next();

		System.out.print( "How much do you weigh (in pounds)? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + "' " + inches + " and weigh " + weight + " pounds." );
	}
}
