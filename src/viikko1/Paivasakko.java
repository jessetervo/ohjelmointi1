package viikko1;

import java.util.Scanner;

public class Paivasakko {
	public static void main(String[] args) {
		System.out.print("Anna nettotulot: ");
		Scanner input = new Scanner (System.in);
		int tulot = input.nextInt();
		int päiväsakko = (tulot - 255) / 60;
		System.out.print("Nettotuloilla " + tulot + " päiväsakko on " + päiväsakko + " euroa");
	}

}
