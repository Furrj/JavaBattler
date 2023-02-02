package EnemyInfo;

import java.util.ArrayList;

public class EnemyManager {
	ArrayList<Enemy> enemies = new ArrayList<>();

	public EnemyManager() {
		enemies.add(new Enemy("Troll", 3, 0, 15));
	}

	public Enemy getEnemy(String name) {
		for (Enemy enemy : enemies) {
			if (enemy.getName().equals(name)) {
				return enemy;
			}
		}

		return new Enemy("Invalid", 0, 0, 0);
	}
}
