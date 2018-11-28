//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;
	}

	public int compareTo( Word rhs )
	{		
		if(word.length()-1>rhs.length()-1)
		return 0;
	}

	public String toString()
	{
		return "";
	}
}