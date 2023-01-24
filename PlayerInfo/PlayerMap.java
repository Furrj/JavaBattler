package PlayerInfo;

public class PlayerMap {
	private int currentLevel = 0;
	private String[] mapIcons = { "O", "X", "X", "X", "X" };
	private String map = mapIcons[0] + "---" + mapIcons[1] + "---" + mapIcons[2] + "---" + mapIcons[3] + "---"
			+ mapIcons[4];

	public void moveUpLevel() {
		mapIcons[currentLevel] = "X";
		currentLevel++;
		mapIcons[currentLevel] = "O";
		updateMap();
	}

	public int getCurrentLevel() {
		return currentLevel + 1;
	}

	public String toString() {
		return map;
	}

	private void updateMap() {
		map = mapIcons[0] + "---" + mapIcons[1] + "---" + mapIcons[2] + "---" + mapIcons[3] + "---"
				+ mapIcons[4];
	}
}
