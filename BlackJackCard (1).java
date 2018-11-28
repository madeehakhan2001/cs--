//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{	public BlackJackCard()
	{
		super( s, f );
	}

	//accessors
public int getValue()
{
	if( getFace() == 1 )
		return 11;
	if( getFace() >= 10 )
		return 10;
	return getFace();
}

	//toString
	public String toString()
	{
		return super.toString() + " " + getValue();
  	//constructors



  	//public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier


	//	return 0;
  	}
  	
 }