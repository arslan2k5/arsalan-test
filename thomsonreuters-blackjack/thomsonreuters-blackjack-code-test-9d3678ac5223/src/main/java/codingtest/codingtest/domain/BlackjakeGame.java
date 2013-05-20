package codingtest.domain;

import codingtest.domain.base.AbstractGame;

public class BlackjakeGame extends AbstractGame{

	
	public BlackjakeGame(int players) {
		super();
		initializePlayers(players);
		gameEndRules.add(new AllPlayersBustedRule());
		gameEndRules.add(new AllPlayersStickRule());
		gameEndRules.add(new AnyPlayerHit21Rule());

	}
	public void play() {

		try {
			int round = 1;
			while(!isGameFinish()){
				System.out.println("Round " + round);
				for (Player player : players) {
					System.out.println("Player " + player.getNumber() +"is playing.");
					player.exchangeCard(deck.getTopCard());
					if(player.getCardsSum() > 21){
						player.setPlayerState(PlayerState.GO_BUST);
					}
				}
			}
			
		} catch (CardsFinishedException e) {
			System.out.println("Dack has finished, ending game.");
		}
		
		Player player = findWinner();
		
		System.out.println("Winner: Player " +player.getNumber()+ "score is " + player.getCardsSum());
		
	}
	public Player findWinner(){
		Player winner = null;
		int lastScore = 0;
		for (Player player : players) {
			System.out.println("Player " +player.getNumber()+ "score is " + player.getCardsSum());
			if(player.getPlayerState() != PlayerState.GO_BUST){
				if(lastScore < player.getCardsSum()){
					lastScore= player.getCardsSum();
					winner = player;
				}
			}
		}
		return winner;
	}
	
	private void initializePlayers(int playersNumber){

		for(int i =0; i<playersNumber; i++){
			System.out.println("Adding Player " + i);
			Card[] cards = new Card[2];
			cards[0] = deck.getTopCard();
			cards[1] = deck.getTopCard();
			players.add(new Player(i, cards));

		}
		
		
	}
	

}
