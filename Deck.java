import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck
{
//make a Deck class

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	public Deck (){
		cards= new ArrayList<Card>();
		top=51;
		for ( String each:SUITS)
			for (int start=1; start<=13;start++)
				cards.add(new BlackJackCard(each,start));
	}
	public Card dealCard(int spot){
		return cards.get(spot-1);
	}


	public void shuffle()
	{
		Collections.shuffle(cards);
		top=51;
	}
	}
		