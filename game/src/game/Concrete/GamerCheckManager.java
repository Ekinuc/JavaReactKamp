package game.Concrete;

import game.Abstract.GamerCheckService;
import game.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public Boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
