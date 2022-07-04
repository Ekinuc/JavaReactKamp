package game.Concrete;

import game.Abstract.GamerService;
import game.Entities.Gamer;

public class GamerManager implements GamerService{
	
	

	public GamerManager() {
		
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println("Gamer added " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated " + gamer.getFirstName());
		
	}

	

}
