import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal would you like to see?");
		String selection = scanner.nextLine();
		if (selection.toLowerCase().equals("cat")) {
			System.out.println("PLACEHOLDER CAT");
		}
		else if (selection.toLowerCase().equals("dog")) {
			System.out.println("PLACEHOLDER DOG");
		}
		else {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
}
