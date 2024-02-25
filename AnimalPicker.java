import java.util.Scanner;

public class AnimalPicker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean repeat = true;
		while (repeat) {
			System.out.println("What animal would you like to see?");
			String selection = scanner.nextLine();
			if (selection.toLowerCase().equals("cat")) {
				System.out.println(	"  |\\      _,,,---,,_\r\n" + //
									"  /,`.-'`'    -.  ;-;;,_\r\n" + //
									" |,4-  ) )-,_. ,\\ (  `'-'\r\n" + //
									"'---''(_/--'  `-'\\_)");
				repeat = false;
			}
			else if (selection.toLowerCase().equals("dog")) {
				System.out.println(	"__\r\n" + //
									" (___()'`;\r\n" + //
									" /,    /`\r\n" + //
									" \\\\\"--\\\\");
				repeat = false;
			}
			else if (selection.toLowerCase().equals("fish")) {
				System.out.println(	"      /\"*._         _\r\n" + //
									"  .-*'`    `*-.._.-'/\r\n" + //
									"< * ))     ,       ( \r\n" + //
									"  `*-._`._(__.--*\"`.\\");
				repeat = false;
			}
			else {
				System.out.println("Invalid input");
			}
		}
		scanner.close();
	}
}
