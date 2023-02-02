import java.util.Scanner;

import EnemyInfo.EnemyManager;
import PlayerInfo.PlayerManager;

public class GameManager {
	private PlayerManager playerManager;
	private Scanner scanner = new Scanner(System.in);
	private UserInterface ui = new UserInterface(scanner);
	private EnemyManager enemyManager = new EnemyManager();
	private GameLoop gameLoop = new GameLoop(scanner, enemyManager);

	public GameManager(PlayerManager playerManager) {
		this.playerManager = playerManager;
	}

	public void initGame() {
		intro();

		mainLoop: while (true) {
			switch (ui.getInput()) {
				case "quit":
					System.out.println("Exiting...");
					break mainLoop;
				case "start":
					gameLoop.startGame();
					break;
				case "help":
					printCommands();
					break;
				case "inv":
					printInventory();
					break;
				case "stats":
					printStats();
					break;
				case "map":
					playerManager.printMap();
					break;
			}
		}
	}

	private void printCommands() {
		System.out.println("Commands:");
		System.out.println("start: Start Game");
		System.out.println("inv: View Inventory");
		System.out.println("stats: View Stats");
		System.out.println("map: View Map");
		System.out.println("help: View Commands");
		System.out.println("quit: Quit Game");
	}

	private void intro() {
		System.out.println("Welcome to JavaBattle");
		printCommands();
	}

	private void printInventory() {
		System.out.println("Viewing inventory");
	}

	private void printStats() {
		playerManager.printStats();
	}
}
