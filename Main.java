import PlayerInfo.PlayerManager;
import PlayerInfo.PlayerMap;

class Main {
	public static void main(String[] args) {
		PlayerMap playerMap = new PlayerMap();
		PlayerManager playerManager = new PlayerManager(playerMap);
		GameManager gameManager = new GameManager(playerManager);

		gameManager.initGame();
	}
}