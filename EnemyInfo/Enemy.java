package EnemyInfo;

public class Enemy {
	private String name;
	private int attack;
	private int defense;
	private int health;

	public Enemy(String name, int attack, int defense, int health) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getHealth() {
		return health;
	}

	public void changeHealth(int change) {
		health += change;
	}

	@Override
	public String toString() {
		return name + "\nAttack: " + attack + "\nDefense: " + defense + "\nHealth: " + health;
	}
}
