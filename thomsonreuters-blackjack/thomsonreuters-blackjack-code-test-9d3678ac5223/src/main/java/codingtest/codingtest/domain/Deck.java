package codingtest.domain;

/**
 * This is the class that represents a deck of cards in a card game.
 */
public class Deck {
	private Card[] cards;
	private static final int SIZE = 52;
	private int currentSize = 0;
	
	
	
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public Deck() {
		cards = new Card[SIZE];
		int size = 0;
		
		for (CardSuit cardSuit : CardSuit.values()) {
			for (CardType cardType : CardType.values()) {
				cards[size++] = new Card(cardSuit, cardType);
			}
		}
		
	}
	public Card getTopCard(){
		if(currentSize == SIZE){
			throw new CardsFinishedException();
		}
		Card card = cards[currentSize++];
		System.out.println("Top card is " +card.getCardSuit().toString()+" , "+ card.getCardType().toString());
		return card;
	}
}
