package pkgCore;

import pkgEnum.*;

public class Card implements Comparable {
	
	//	DONE: Card has two attributes, eRank and eSuit, add these attributes
	private eSuit suit;
	private eRank rank;
	
	//	DONE: Build a constructor for Card passing in eRank and eSuit
	public Card(eSuit suit, eRank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		//return 0;
		return c.getRank().compareTo(this.getRank());

	}

	//	DONE: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit - BUDWHYTHO?!
	private void setRank(eRank rank)
	{
		this.rank = rank;
	}


	private void setSuit(eSuit suit)
	{
		this.suit = suit;
	}


	public eRank getRank()
	{
		return rank;
	}


	public eSuit getSuit()
	{
		return suit;
	}
	
}
