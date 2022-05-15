package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Kimppakyyti {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ajetut kilometrit: ");
		double kilometrit = input.nextDouble();
		System.out.print("Anna kulutus per 100 km: ");
		double kulutus = input.nextDouble();
		System.out.print("Anna polttoaineen litrahinta: ");
		double litraHinta = input.nextDouble();
		System.out.print("Anna kimppakyytiläisten lukumäärä: ");
		double kyytiläiset = input.nextDouble();
		double bensaKustannus = kilometrit * kulutus / 100 * litraHinta / kyytiläiset;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.println("Bensakustannus per henkilö on " + desimaalit.format(bensaKustannus) + " euroa" );
	}

}
