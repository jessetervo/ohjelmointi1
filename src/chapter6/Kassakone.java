package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassakone {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		double hinta = 0;
		double yhteensa = 0;
		
		System.out.println("Anna ostoksen hinta (0 lopettaa):");
		hinta = input.nextDouble();
		
		while(hinta != 0) {
			yhteensa = yhteensa + hinta;
		System.out.println("Anna ostoksen hinta (0 lopettaa):");
		hinta = input.nextDouble();
		}
		double alv = (yhteensa * 24) / 124;
		System.out.println("Ostosten verollinen hinta on " + desimaalit.format(yhteensa));
		System.out.println("ALV:n osuus on " + desimaalit.format(alv));
		System.out.println("Veroton hinta on " + desimaalit.format(yhteensa - alv));
	
	}

}
