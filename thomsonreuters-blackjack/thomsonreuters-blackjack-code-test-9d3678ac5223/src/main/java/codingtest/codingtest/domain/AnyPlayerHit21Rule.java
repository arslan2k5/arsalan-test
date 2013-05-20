package codingtest.domain;

import java.util.List;

import codingtest.domain.base.Rule;

public class AnyPlayerHit21Rule implements Rule {
	
	private static final int SUM=21;

	@Override
	public boolean isApply(List<Player> players) {
		System.out.println("Applying any player hit 21 rule.");
		for (Player player : players) {
			if(player.getCardsSum() == SUM){
				return true;
			}
		}
		return false;
	}

}
