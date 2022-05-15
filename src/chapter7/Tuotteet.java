package chapter7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuotteet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		int tuotenumero;
		String nimi, kuvaus;
		double hinta;
		
		System.out.println("Anna tuotenumero: ");
		tuotenumero = input.nextInt();
		input.nextLine();
		
		System.out.println("Anna tuotteen nimi: ");
		nimi = input.nextLine();
		
		System.out.println("Anna tuotteen hinta: ");
		hinta = input.nextDouble();
		input.nextLine();
		
		System.out.println("Anna tuotteen kuvaus: ");
		kuvaus = input.nextLine();
		
		nimi = nimi.trim();
		nimi = nimi.toUpperCase();
		
		kuvaus = kuvaus.trim();
		
		System.out.println("Numero: " + tuotenumero);
		System.out.println("Nimi: " + nimi);
		System.out.println("Hinta: "+ desimaalit.format(hinta));
		if (kuvaus.matches("\\s") == false) {
			System.out.println("Kuvaus: " + kuvaus);
		}
		
	}

}

