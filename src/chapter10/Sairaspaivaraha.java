package chapter10;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Sairaspaivaraha {
	static  Scanner input = new Scanner(System.in);
	static DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	static double kysyVuosityötulo() {
		System.out.println("Anna vuositulosi: ");
		double tulot = input.nextDouble();
		return tulot;
	}	
	
	static double laskePaivaraha(double tulot) {
		double sairaspaivaraha;
		if (tulot <= 1399) {
			sairaspaivaraha = 0;
		} else if (tulot > 1399 && tulot <= 36419) {
			sairaspaivaraha = (0.7 * tulot / 300);
		} else if (tulot > 36419 && tulot <= 56032) {
			sairaspaivaraha = (84.98 + 0.4 * (tulot - 36419) / 300);
		} else sairaspaivaraha = (111.13 + 0.25 * (tulot - 56032) / 300);
		return sairaspaivaraha;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tulot = kysyVuosityötulo();
		double sairaspaivaraha = laskePaivaraha(tulot);
		System.out.println("Vuosituloilla " + desimaalit.format(tulot) + " sairaspäiväraha on " + desimaalit.format(sairaspaivaraha) + " euroa/päivä.");

	}

}
