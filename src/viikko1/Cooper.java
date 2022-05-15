package viikko1;

import java.util.Scanner;
public class Cooper {
	public static void main(String[] args) {
		System.out.print("Anna juostu matka: ");
		Scanner input = new Scanner (System.in);
		int matka = input.nextInt();
		int kierroksia = matka / 400;
		System.out.print("Kokonaisia 400 metrin kierroksia oli " + kierroksia );
	}
		
}
