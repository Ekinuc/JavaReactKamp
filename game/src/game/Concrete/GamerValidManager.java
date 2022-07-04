package game.Concrete;

import game.Abstract.GamerCheckService;
import game.Entities.Gamer;

public class GamerValidManager extends GamerManager{
	
	private GamerCheckService gamerCheckService;

	public GamerValidManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.add(gamer);
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	

}
