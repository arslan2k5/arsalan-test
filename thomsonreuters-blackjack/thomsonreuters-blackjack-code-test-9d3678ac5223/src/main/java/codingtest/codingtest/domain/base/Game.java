package codingtest.domain.base;

import codingtest.domain.Player;

public interface Game {
	
	void play();
	
	Player findWinner();

}
