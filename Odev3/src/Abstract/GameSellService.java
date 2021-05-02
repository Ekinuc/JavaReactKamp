package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameSellService {
	void sell(Game game, Gamer gamer);
	void sell(Game game,Gamer gamer,Campaign campaign);
}
