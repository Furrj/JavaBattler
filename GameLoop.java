import java.util.Scanner;

import EnemyInfo.*;

public class GameLoop {
	Scanner scanner;
	EnemyManager enemyManager;
	Enemy currentEnemy;

	public GameLoop(Scanner scanner, EnemyManager enemyManager) {
		this.scanner = scanner;
		this.enemyManager = enemyManager;
	}

	public void startGame() {
		currentEnemy = enemyManager.getEnemy("Troll");
		System.out.println("Game has started");
		System.out.println("You come across your first enemy...");
		System.out.println(currentEnemy);
	}

	public void battle() {

	}
}
