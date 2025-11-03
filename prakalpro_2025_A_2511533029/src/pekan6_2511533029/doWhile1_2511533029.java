package pekan6_2511533029;
import java.util.Scanner;
public class doWhile1_2511533029 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String phrase;
		do {
			System.out.print("input password: ");
			phrase =console.nextLine();
		} while (!phrase.equals("abcd"));

	}

}
