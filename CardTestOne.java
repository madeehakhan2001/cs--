//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.awt.Color;

public class CardTestOne
{
	public static void main( String args[] )
	{
		Card one = new BlackJackCard("",0);
		out.println(one);

		Card two = new BlackJackCard("DIAMONDS",1);
		out.println(two);

		Card three = new BlackJackCard("CLUBS",4);
		out.println(three);
		
		Card four = new BlackJackCard("SPADES",12);
		out.println(four);
	
		Card five = new BlackJackCard("HEARTS",12);
		out.println(five);	
		
		Card six = new BlackJackCard("SPADES",9);
		out.println(six);				

		out.println(one.equals(two));
		out.println(one.equals(one));		
		out.println(four.equals(five));	
		out.println(three.equals(four));						
	}
}