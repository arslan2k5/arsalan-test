package codingtest.domain;

import codingtest.domain.base.Game;

public class GameContext {
	private Game game;
	
	public GameContext(Game game) {
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	public void play(){
		game.play();
	}

}
