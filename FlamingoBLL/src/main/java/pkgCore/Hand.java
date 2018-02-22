package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int ScoreHand()
	{
		// We changed ScoreHand() to return an int rather than an array of ints.
		// We don't see why returning an array of ints that represent the score is relevent.
		// So we will simply score the hand, and return that integer.
		// Also iScore is already defined as an int attribute.
		
		//int [] iScore = new int[2];
		
		//iScore[0] = 5;
		//iScore[1] = 10;
		
		this.iScore = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			//	DONE: Determine the score.  
			//			Cards:
			//			2-3-4 - score = 11
			//			5-J-Q - score = 25
			//			5-6-7-2 - score = 20
			//			J-Q	- score = 20
			//			8-A = score = 9 or 19
			//			4-A = score = 5 or 15
			this.iScore += c.getRank().getiRankNbr();
		}
		
		return this.iScore;
	}
	
	public void Draw(Deck d)
	{
		//	DONE: add a card to 'cards' from a card drawn from Deck d
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
