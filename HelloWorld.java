import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean repeat = true;
		while (repeat) {
			System.out.println("What animal would you like to see?");
			String selection = scanner.nextLine();
			if (selection.toLowerCase().equals("cat")) {
				System.out.println("PLACEHOLDER CAT");
				repeat = false;
			}
			else if (selection.toLowerCase().equals("dog")) {
				System.out.println("PLACEHOLDER DOG");
				repeat = false;
			}
			else {
				System.out.println("Invalid input");
			}
		}
		scanner.close();
	}
}
