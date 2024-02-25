import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal would you like to see?");
		String selection = scanner.nextLine();
		if (selection.toLowerCase() == "cat") {
			System.out.println("PLACEHOLDER CAT");
		}
		else if (selection.toLowerCase() == "dog") {
			System.out.println("PLACEHOLDER DOG");
		}
		scanner.close();
	}
}
