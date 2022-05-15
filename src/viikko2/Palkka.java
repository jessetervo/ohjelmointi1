package viikko2;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Palkka {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna palkka: ");
		int palkka = input.nextInt();
		System.out.print("Anna veroprosentti: ");
		double veroprosentti = input.nextDouble();
		System.out.print("Anna ikä: ");
		double ikä = input.nextDouble();
		double työeläkevakuutusmaksu = 0.0675;
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.print("\n");
		double vero = palkka * veroprosentti / 100;
		double työttömyysvakuutus = palkka * 0.015;
		if (ikä >= 53 && ikä <= 62) {
			työeläkevakuutusmaksu = 0.0825;
		}
		
		double veronOsuus = (palkka * veroprosentti / 100);
		double työelvak = (palkka * työeläkevakuutusmaksu);
		double tvakos = (palkka * 0.015);
		double kateenJaa = (palkka - vero - työttömyysvakuutus - työelvak);
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + desimaalit.format(veronOsuus));
		System.out.println("Työeläkevakuutusmaksun osuus " + desimaalit.format(työelvak));
		System.out.println("Työttömyysvakuutuksen osuus " + desimaalit.format(tvakos));
		System.out.println("Käteen jää " + desimaalit.format(kateenJaa));
		
		
		
	}

}
