package viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Peltipoliisi {
	


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		// TODO Auto-generated method stub
		
		double nopeus = 0;
		System.out.println("Anna nopeutesi: ");
		nopeus = input.nextDouble();
		if (nopeus < 100 && nopeus > 80) {
			System.out.println("Rikesakko");
		}
		if (nopeus < 80) {
			System.out.println("Ei sakkoja");
		}
		if (nopeus >= 100) {
			System.out.println("Päiväsakko");
			System.out.println("Anna nettokuukausitulosi: ");
			double tulot = input.nextDouble();
			double päiväsakko = (tulot - 255) / 60;
			if (päiväsakko < 6) {
				päiväsakko = 6;
			}
			System.out.println("Päiväsakon määrä on " + desimaalit.format(päiväsakko) + " euroa");
			
		}

		
		

	}

}
