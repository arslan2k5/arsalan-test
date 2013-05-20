package codingtest.domain.base;

import java.util.ArrayList;
import java.util.List;

import codingtest.domain.Deck;
import codingtest.domain.Player;
import codingtest.domain.ShuffleContext;
import codingtest.domain.SimpleShuffle;
import codingtest.domain.base.Game;

public abstract class AbstractGame implements Game {
	protected Deck deck;
	protected List<Player> players;
	protected List<Rule> gameEndRules;
	
	public AbstractGame() {
		deck = new Deck();
		ShuffleContext shuffleContext = new ShuffleContext();
		shuffleContext.setShuffle( new SimpleShuffle());
		shuffleContext.shuffle(deck);
		players = new ArrayList<Player>();
		gameEndRules = new ArrayList<Rule>();
	}
	
	protected boolean isGameFinish(){
		
		for (Rule rule : gameEndRules) {
			if(rule.isApply(players)){
				return true;
			}
		}
		return false;
		
	}

}
