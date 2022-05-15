package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		int lukukausia = 0;
		int asdf = 0;
		System.out.println("Anna lukukausien määrä: ");
		lukukausia = input.nextInt();
		
		int yhteensa = 0;
		for (asdf = 0; asdf < lukukausia; asdf++) {
			System.out.println("Anna " + (asdf + 1) + ". lukukauden opintopisteesi:");
			int opintopiste = input.nextInt();
			yhteensa = yhteensa + opintopiste;
		}
		System.out.println("Sinulla pitäisi olla tähän mennessä " + (lukukausia * 30) + " opintopistettä.");
		System.out.println("Sinulla on " + yhteensa + " opintopistettä.");
		if(yhteensa < lukukausia * 30) {
			System.out.println("Olet jäljessä tavoitteesta.");
		}
		if(yhteensa > lukukausia * 30) {
			System.out.println("Olet edellä tavoitteesta.");
		}
		if(yhteensa == lukukausia * 30) {
			System.out.println("Olet tavoitteessa.");
		}
		int tavoite = 210;
		System.out.println("Tutkinnosta puuttuu vielä " + (tavoite - yhteensa) + " opintopistettä.");
	}
	
		

}
