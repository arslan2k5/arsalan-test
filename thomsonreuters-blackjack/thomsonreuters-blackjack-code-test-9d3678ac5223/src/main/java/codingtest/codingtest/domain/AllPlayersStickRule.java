package codingtest.domain;

import java.util.List;

import codingtest.domain.base.Rule;

public class AllPlayersStickRule implements Rule {

	@Override
	public boolean isApply(List<Player> players) {
		System.out.println("Applying stick rule");
		for (Player player : players) {
			if(player.getPlayerState() != PlayerState.STICK){
				return false;
			}
		}
		return true;
	}

}
