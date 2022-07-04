package game;

import game.Adapters.MernisServiceAdapters;
import game.Concrete.CampaignManager;
import game.Concrete.GameManager;
import game.Concrete.GameSellManager;
import game.Concrete.GamerCheckManager;
import game.Concrete.GamerManager;
import game.Concrete.GamerValidManager;
import game.Entities.Campaign;
import game.Entities.Game;
import game.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game cs = new Game(1, "CS", 100);
		Gamer ekin = new Gamer(1, "10187526156", "Ekin", "Uç", 2004);
		Campaign summer = new Campaign(1, "Summer Campaign", "20.08.2022",10);
		CampaignManager campaignManager = new CampaignManager();
		GamerManager gamerManager = new GamerManager();
		GamerValidManager gamerValidManager = new GamerValidManager(new MernisServiceAdapters());
		GameSellManager gameSellManager = new GameSellManager();
		GameManager gameManager = new GameManager();
		
		gamerValidManager.add(new Gamer(1, "10187526156", "Ekin", "Uç", 2004));
		gameManager.add(new Game(1, "CS", 100));
		campaignManager.add(new Campaign(1, "Summer Campaign", "20.08.2022",10));
		gameSellManager.sell(cs, ekin, summer);
		
		

	}

}
