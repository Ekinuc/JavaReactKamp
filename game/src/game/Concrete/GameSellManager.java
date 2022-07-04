package game.Concrete;

import game.Abstract.GameSellService;
import game.Entities.Campaign;
import game.Entities.Game;
import game.Entities.Gamer;

public class GameSellManager implements GameSellService{

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(game.getName() + " Sold to " + gamer.getFirstName());
		
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		game.setGamePrice(game.getGamePrice() - game.getGamePrice()*campaign.getDiscount()/100);
		System.out.println(game.getName() + " Sold with " + campaign.getName() + " to " + gamer.getFirstName() + "Price : " + game.getGamePrice());
		
	}

}
