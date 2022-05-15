package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Matka {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna matka: ");
		double matka = input.nextDouble();
		System.out.print("Anna nopeus: ");
		double nopeus = input.nextDouble();
		double aika = (double) matka / nopeus;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Aikaa menee " + desimaalit.format(aika) + " tuntia" );
	}

}
