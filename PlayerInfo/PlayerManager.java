package PlayerInfo;

public class PlayerManager {
	private PlayerMap playerMap;
	private int health = 100;
	private int attack = 5;
	private int playerlevel = 0;
	private int playerPoints = 0;

	public PlayerManager(PlayerMap playerMap) {
		this.playerMap = playerMap;
	}

	public void updateHealth(int newHealth) {
		health = newHealth;
	}

	public int getHealth() {
		return health;
	}

	public void changeHealth(int change) {
		health += change;
	}

	public int getAttack() {
		return attack;
	}

	public int getCurrentLevel() {
		return playerMap.getCurrentLevel();
	}

	public void printMap() {
		System.out.println(playerMap);
	}

	public void printStats() {
		System.out.println("Stats:");
		System.out.println("Health: " + getHealth());
		System.out.println("Attack: " + getAttack());
		System.out.println("Level: " + getCurrentLevel());
	}
}
