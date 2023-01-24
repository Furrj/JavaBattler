import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;

	public UserInterface(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getInput() {
		return scanner.nextLine();
	}
}
