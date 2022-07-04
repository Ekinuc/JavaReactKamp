package game.Concrete;

import game.Abstract.GameService;
import game.Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated " + game.getName());
		
	}

}
