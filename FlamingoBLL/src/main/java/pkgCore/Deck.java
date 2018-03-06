package pkgCore;

import pkgEnum.eSuit;
import pkgEnum.eRank;
import java.util.ArrayList;

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
		// Variables that will be updated in the loops
		eSuit suit = eSuit.HEARTS;
		eRank rank = eRank.ONE;
		
		// Deck quantity
		for (int i = 0; i < deckNum; i++)
		{
			// Suits in the deck
			for (int j = 0; j < 4; j++)
			{
				switch(j)
				{
				case 0:
					suit = eSuit.HEARTS;
					break;
				case 1:
					suit = eSuit.CLUBS;
					break;
				case 2:
					suit = eSuit.DIAMONDS;
					break;
				case 3:
					suit = eSuit.DIAMONDS;
					break;
				}
				
				// Cards in the suits
				for (int k = 0; k < 13; k++)
				{
					switch(k)
					{
					case 0:
						rank = eRank.ONE;
						break;
					case 1:
						rank = eRank.TWO;
						break;
					case 2:
						rank = eRank.THREE;
						break;
					case 3:
						rank = eRank.FOUR;
						break;
					case 4:
						rank = eRank.FIVE;
						break;
					case 5:
						rank = eRank.SIX;
						break;
					case 6:
						rank = eRank.SEVEN;
						break;
					case 7:
						rank = eRank.EIGHT;
						break;
					case 8:
						rank = eRank.NINE;
						break;
					case 9:
						rank = eRank.TEN;
						break;
					case 10:
						rank = eRank.JACK;
						break;
					case 11:
						rank = eRank.QUEEN;
						break;
					case 12:
						rank = eRank.KING;
						break;
					case 13:
						rank = eRank.ACE;
						break;
					}
					
					// Add the card to the deck of cards
					cards.add(new Card(suit, rank));
				}
			}
		}
	}
	
	
	//	DONE: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	public Card draw()
	{
		return cards.remove(cards.size() - 1);
	}
	
	public int getSize()
	{
		return cards.size();
	}
}
