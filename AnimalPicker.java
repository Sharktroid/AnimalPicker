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
			// just realized your prompt said what animal do you want to see so....
			else if (selection.toLowerCase().equals("keyboard")) {
				System.out.println(". -------------------------------------------------------------------.        \n| [Esc] [F1][F2][F3][F4][F5][F6][F7][F8][F9][F0][F10][F11][F12] o o o|        \n|                                                                    |        \n| [`][1][2][3][4][5][6][7][8][9][0][-][=][_<_] [I][H][U] [N][/][*][-]|        \n| [|-][Q][W][E][R][T][Y][U][I][O][P][{][}] | | [D][E][D] [7][8][9]|+||        \n| [CAP][A][S][D][F][G][H][J][K][L][;][\'][#]|_|           [4][5][6]|_||        \n| [^][\\][Z][X][C][V][B][N][M][,][.][/] [__^__]    [^]    [1][2][3]| ||        \n| [c]   [a][________________________][a]   [c] [<][V][>] [ 0  ][.]|_||        \n`--------------------------------------------------------------------\'");
				repeat = false;
			}
			else {
				System.out.println("Invalid input");
			}
		}
		scanner.close();
	}
}
