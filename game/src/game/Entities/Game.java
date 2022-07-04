package game.Entities;

public class Game {
	private int gameId;
	private String name;
	private int gamePrice;
	
	public Game() {
		
	}
	
	public Game(int gameId, String name, int gamePrice) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

}
