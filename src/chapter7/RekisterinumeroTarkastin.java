package chapter7;

import java.util.Scanner;
public class RekisterinumeroTarkastin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		
		String rekisterinumero;
		System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
		rekisterinumero = input.nextLine();
		rekisterinumero = rekisterinumero.toUpperCase();
		rekisterinumero = rekisterinumero.replaceAll("\\s", "");
		do {
		if(rekisterinumero.matches("[A-ZÅÄÖ]{2,3}[-]\\d{1,3}") == true) {
			System.out.println(rekisterinumero + " on kelvollinen rekisterinumero.");
		} else {
			System.out.println(rekisterinumero + " ei ole kelvollinen rekisterinumero.");
		}
		System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
		rekisterinumero = input.nextLine();
		rekisterinumero = rekisterinumero.toUpperCase();
		rekisterinumero = rekisterinumero.replaceAll("\\s", "");
		} while (rekisterinumero.equalsIgnoreCase("Q") == false);
	}

}
