package codingtest;

import codingtest.domain.BlackjakeGame;
import codingtest.domain.GameContext;

/**
 * Class that handles the playing of a card game from a simple command line interface,
 * and echoes back a step-by-step description of the game to the console.
 */
public class CardGame {
	
	private static final int DEFAULT_PLAYERS = 3;

    /**
     * Main. Plays a card game from a command line interface.
     * @param args the arguments to the game
     */
    public static void main(String[] args) {
    	int playersNumber = DEFAULT_PLAYERS;
    	if(args.length >0 && args.length ==1){
    		playersNumber = Integer.parseInt(args[0]);
    	}
    	
    	GameContext game = new GameContext(new BlackjakeGame(playersNumber));
    	game.play();
    }
}
