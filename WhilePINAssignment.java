package assignments;

import java.util.Scanner;

public class WhilePINAssignment {
	
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int accountnumber = 123456789;

		System.out.println("WELCOME TO THE BANK OF ATM ATM.");
		System.out.print("ENTER YOUR ACCOUNT NUMBER: ");
		int entry = keyboard.nextInt();

		while ( entry != accountnumber )
		{
			System.out.println("\nACCOUNT NUMBER NOT DETECTED. PLEASE ENTER YOUR ACCOUNT NUMBER.");
			System.out.print("ENTER YOUR ACCOUNT NUMBER: ");
			entry = keyboard.nextInt();
		}
		int pin = 1956;

		
		System.out.print("ENTER YOUR PIN: ");
		int entry1 = keyboard.nextInt();

		while ( entry1 != pin )
		{
			System.out.println("\nINCORRECT PIN. PLEASE ENTER THE CORRECT PIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry1 = keyboard.nextInt();
		}

		System.out.println("\nACCOUNT NUMBER AND PIN ACCEPTED."
				+ "\n"
				+ "\nHERE ARE YOUR OPTIONS BELOW."
				+ "\nCHECKING BALANCE"
				+ "\nSAVINGS BALANCE");
	}

}
