package Concrete;
import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSellManager implements GameSellService{

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(game.getName() + " Sold to " + gamer.getFirstName());
		
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " Sold with " + campaign.getName() + " to " + gamer.getFirstName());
		
	}
	
}
