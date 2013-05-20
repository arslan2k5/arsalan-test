package codingtest.domain.base;

import java.util.List;

import codingtest.domain.Player;

public interface Rule {
	
	boolean isApply(List<Player> players);

}
