package PlayerInfo;

public class PlayerManager {
	private PlayerMap playerMap;
	private int health = 100;

	public PlayerManager(PlayerMap playerMap) {
		this.playerMap = playerMap;
	}

	public void updateHealth(int newHealth) {
		health = newHealth;
	}

	public int getHealth() {
		return health;
	}

	public int getCurrentLevel() {
		return playerMap.getCurrentLevel();
	}

	public void printStats() {
		System.out.println("Stats:");
		System.out.println("Health: " + getHealth());
		System.out.println("Level: " + getCurrentLevel());
	}
}
