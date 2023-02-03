import EnemyInfo.*;
import PlayerInfo.PlayerManager;

public class GameLoop {
	UserInterface ui;
	EnemyManager enemyManager;
	PlayerManager playerManager;
	Enemy currentEnemy;

	public GameLoop(UserInterface ui, PlayerManager playerManager, EnemyManager enemyManager) {
		this.ui = ui;
		this.playerManager = playerManager;
		this.enemyManager = enemyManager;
	}

	public void startGame() {
		currentEnemy = enemyManager.getEnemy("Troll");
		System.out.println("Game has started");
		System.out.println("You come across your first enemy...");
		System.out.println(currentEnemy);
		System.out.println("Enter start to start battle");
		battleLoop: switch (ui.getInput()) {
			case "start":
				battle();
				break;
			case "quit":
				break battleLoop;
		}
	}

	public void battle() {
		System.out.println("Battle has started, enter s to proceed stepwise");
		printCurrentStats();
		while (true) {
			if (ui.getInput().equals("s")) {
				battleStep(playerManager, currentEnemy);
			} else if (ui.getInput().equals("quit")) {
				break;
			}
		}
	}

	private void printCurrentStats() {
		System.out.println(currentEnemy);
		System.out.println("You: ");
		playerManager.printStats();
	}

	private void battleStep(PlayerManager playerManager, Enemy currentEnemy) {
		playerManager.changeHealth(-1 * currentEnemy.getAttack());
		currentEnemy.changeHealth(-1 * playerManager.getAttack());
		if (!winCheck(playerManager, currentEnemy)) {
			printCurrentStats();
		}
	}

	private boolean winCheck(PlayerManager playerManager, Enemy currentEnemy) {
		if (playerManager.getHealth() <= 0) {
			System.out.println("You lose");
			return true;
		}

		if (currentEnemy.getHealth() <= 0) {
			System.out.println("You win");
			return true;
		}

		return false;
	}
}
