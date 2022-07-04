package game.Abstract;

import game.Entities.Campaign;
import game.Entities.Game;
import game.Entities.Gamer;

public interface GameSellService {
	void sell(Game game, Gamer gamer);
	void sell (Game game, Gamer gamer,Campaign campagin);

}
