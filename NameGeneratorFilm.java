package assignments;

import java.net.URL;
import java.util.Scanner;

public class NameGeneratorFilm {
	
	public static void main(String[] args) throws Exception
	{

		String[] adjectives = arrayFromUrl("https://grammar.yourdictionary.com/parts-of-speech/adjectives/list-of-adjective-words.html");
		String[] nouns      = arrayFromUrl("https://eslgrammar.org/list-of-nouns/");

		System.out.println("Mitchell's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		String adjective = "Cool";
		String noun = "Mitchell";

		System.out.println( "Your movie title is: " + adjective + " " + noun );
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}
