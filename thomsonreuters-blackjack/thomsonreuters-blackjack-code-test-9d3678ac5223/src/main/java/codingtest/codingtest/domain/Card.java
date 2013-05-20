package codingtest.domain;

/**
 * This is the domain class that represents a card in a card game.
 */
public class Card {
	private CardSuit cardSuit;
	private CardType cardType;
	
	public Card(CardSuit cardSuit, CardType cardType) {
		this.cardSuit = cardSuit;
		this.cardType = cardType;
		
	}
	public CardSuit getCardSuit() {
		return cardSuit;
	}
	public void setCardSuit(CardSuit cardSuit) {
		this.cardSuit = cardSuit;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
	
}
