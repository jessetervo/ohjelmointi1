package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		double yhteensä = 0;
		double tyokorvaus = 0;
		System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
		tyokorvaus = input.nextDouble();
		
		while(tyokorvaus != 0) {
			yhteensä = yhteensä + tyokorvaus;
			System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
			tyokorvaus = input.nextDouble();
			}
		yhteensä = (yhteensä * 50 / 100) - 100;
		if(yhteensä <= 0) {
			System.out.println("Kotitalousvähennyksen määrä on 0,00 euroa");
		}
		if(yhteensä >= 2400) {
			System.out.println("Kotitalousvähennyksen määrä on 2400,00 euroa");
		}
		if(yhteensä > 0 && yhteensä < 2400) {
			System.out.println("Kotitalousvähennyksen määrä on " + yhteensä + " euroa");
		}
	}

}
