package tunti2;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Palkka {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.print("Anna palkka: ");
		int palkka = input.nextInt();
		System.out.print("Anna veroprosentti: ");
		double veroprosentti = input.nextDouble();
		System.out.print("Anna ikä: ");
		int ika = input.nextInt();
		double vero = palkka * veroprosentti / 100;
		double tyel = 0;
		if(ika < 53) {
			tyel = palkka * 0.0555;
		} else {
			tyel = palkka * 0.0705;
		}
		
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + desimaalit.format(palkka * veroprosentti / 100));
		System.out.println("Työeläkevakuutusmaksun osuus " + desimaalit.format(tyel));
		System.out.println("Työttömyysvakuutuksen osuus " + desimaalit.format(palkka * 0.0115));
		System.out.println("Käteen jää " + desimaalit.format(palkka - vero - (palkka * 0.0115) - tyel));
		
	}

}
