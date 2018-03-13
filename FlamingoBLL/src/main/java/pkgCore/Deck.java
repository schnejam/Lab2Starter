package pkgCore;

import pkgEnum.eSuit;
import pkgEnum.eRank;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	//	DONE: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	
	//	DONE: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	public Deck(int deckNum)
	{	
		for (int i = 0; i < deckNum; i++)
		{
			for (eSuit eSuit: eSuit.values())
			{
				for (eRank eRank: eRank.values())
				{
					cards.add(new Card(eSuit, eRank));
				}
			}
		}
		
		Collections.shuffle(cards);
	}
	
	public Deck()
	{
		this(1);
	}
	
	
	//	DONE: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	public Card draw()
	{
		return cards.remove(0);
	}
	
	public int getSize()
	{
		return cards.size();
	}
	
	public int getRemaining(Object eNum)
	{
		int total = 0;
		if(eNum instanceof eSuit)
		{
			for(Card c : cards)
			{
				if(c.getSuit() == (eSuit)eNum)
					total++;
			}	
		}
		if(eNum instanceof eRank) 
		{
			for(Card c : cards)
			{
				if(c.getRank() == (eRank)eNum)
					total++;
			}
		}
		return total;
	}
}
