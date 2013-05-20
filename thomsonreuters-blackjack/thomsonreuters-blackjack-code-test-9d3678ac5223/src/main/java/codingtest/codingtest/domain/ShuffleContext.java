package codingtest.domain;

import codingtest.domain.base.Shuffle;

public class ShuffleContext {
	private Shuffle shuffle;

	public Shuffle getShuffle() {
		return shuffle;
	}

	public void setShuffle(Shuffle shuffle) {
		this.shuffle = shuffle;
	}
	
	public void shuffle(Deck deck){
		shuffle.shuffle(deck);
	}

}
