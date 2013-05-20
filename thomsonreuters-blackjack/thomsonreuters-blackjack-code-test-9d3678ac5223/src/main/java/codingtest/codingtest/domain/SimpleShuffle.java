package codingtest.domain;

import codingtest.domain.base.Shuffle;

public class SimpleShuffle implements Shuffle {

	@Override
	public void shuffle(Deck dack) {
		for(int i =0;i<25;i++){
			
			int random1 = (int)Math.ceil((Math.random() * 10))%51;
			int random2 = (int)Math.ceil((Math.random() * 10))%51;
			swap(dack, random1, random2);
		}

	}
	
	private void swap(Deck deck, int i, int j){
		Card card = deck.getCards()[i];
		deck.getCards()[i] =deck.getCards()[j];
		deck.getCards()[j] = card;
	}

}
