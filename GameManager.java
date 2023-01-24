import java.util.Scanner;
import PlayerInfo.PlayerManager;

public class GameManager {
	private PlayerManager playerManager;
	private Scanner scanner = new Scanner(System.in);
	private UserInterface ui = new UserInterface(scanner);

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
					startGame();
					break;
				case "help":
					printCommands();
					break;
				case "inv":
					printInventory();
					break;
				case "stats":
					playerManager.printStats();
					break;
			}
		}
	}

	private void printCommands() {
		System.out.println("Commands:");
		System.out.println("start: Start Game");
		System.out.println("inv: View Inventory");
		System.out.println("stats: View Stats");
		System.out.println("quit: Quit Game");
		System.out.println("help: View Commands");
	}

	private void intro() {
		System.out.println("Welcome to JavaBattle");
		printCommands();
	}

	private void startGame() {
		System.out.println("Game has started");
	}

	private void printInventory() {
		System.out.println("Viewing inventory");
	}

	private void printStats() {

	}
}
