package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

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
		
		this.iScore = 0;
		
		Collections.sort(cards);
		
		boolean isAce = false;
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
			
			if (c.getRank().getiRankNbr() < 11)
				this.iScore += c.getRank().getiRankNbr();
			else if (c.getRank().getiRankNbr() < 14)
				this.iScore += 10;
			else
			{
				this.iScore++;
				isAce = true;
			}
		}
		
		if (isAce)
		{
			if (this.iScore + 10 <= 21)
				this.iScore += 10;
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
	
	public boolean CanDealerHit()
	{
		if (iScore >= 17)
			return false;
		return true;
	}
	
	public boolean CanPlayerDraw()
	{
		if (iScore < 21)
			return true;
		return false;
	}
	
	public boolean isBlackJack()
	{
		int iScore = ScoreHand();
		
		if ((iScore == 21) && (cards.size() == 2))
			return true;
		return false;
	}
}
