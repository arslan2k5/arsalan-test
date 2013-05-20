package codingtest.domain;

public class Player {
	private Card[] cards;
	private PlayerState playerState = PlayerState.HIT;
	private int number;
	
	public Player(int number, Card[] cards) {
		this.number = number;
		this.cards = cards;
	}

	
	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public Card[] getCards() {
		return cards;
	}

	
	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public PlayerState getPlayerState() {
		return playerState;
	}

	public void setPlayerState(PlayerState playerState) {
		this.playerState = playerState;
	}
	
	public int getCardsSum(){
		int sum=0;
		for(int i =0;i<cards.length;i++){
			sum += cards[i].getCardType().getScore();
		}
		
		return sum;
	}
	
	public void exchangeCard(Card card){
		int minCardIndex =-1;
		int previousScore =0;
		for(int i =0 ;i<cards.length;i++){
			if(cards[i].getCardType().getScore() <previousScore){
				minCardIndex =  i;
			}
		}
		if(minCardIndex != -1){
			cards[minCardIndex] = card;
		}
	}

}
