package codingtest.domain;

import java.util.List;

import codingtest.domain.base.Rule;

public class AllPlayersBustedRule implements Rule {

	@Override
	public boolean isApply(List<Player> players) {
		System.out.println("Applying busted rule");
		int busted = 0;
		for (Player player : players) {
			if(player.getPlayerState() == PlayerState.GO_BUST){
				busted++;
			}
		}
		if(busted == players.size() -1){
			return true;
		}
		return false;
	}

}
