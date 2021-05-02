package ConsoleUI;
import Concrete.CampaignManager;
import Concrete.EdevletManager;
import Concrete.GameManager;
import Concrete.GameSellManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		CampaignManager campaignManager = new CampaignManager();
		EdevletManager edevletManager = new EdevletManager();
		GamerManager gamerManager = new GamerManager();
		GameSellManager gameSellManager = new GameSellManager();
		GameManager gameManager = new GameManager();
		
		Gamer Ekin = new Gamer(1, "12345678911", "Ekin", "Uç", 2004);
		Game BF1 = new Game(1, "Battlefield1", 500);
		Campaign holiday = new Campaign(1, "Holiday", "30.08.2021");
		
		
		gameManager.add(BF1);
		campaignManager.add(holiday);
		gamerManager.add(Ekin);
		edevletManager.verify(Ekin);
		
		gameSellManager.sell(BF1, Ekin, holiday);
		
		
	}

}
