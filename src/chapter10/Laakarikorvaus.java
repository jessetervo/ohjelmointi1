package chapter10;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Laakarikorvaus {
	static  Scanner input = new Scanner(System.in);
	static DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	public static double laskeKorvaus(int kesto) {
		double korvaus;
		if (kesto <= 10) {
			korvaus = 8;
		} else if (kesto <= 20) {
			korvaus = 11;
		} else {
			korvaus = 13.50;
		}
		return korvaus;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Anna käynnin kesto: ");
		int kesto = input.nextInt();
		
		double korvaus = laskeKorvaus(kesto);
		System.out.println("Kestoltaan " + kesto + " minuutin yleislääkärikäynnistä kelakorvaus on " + desimaalit.format(korvaus) + " euroa");
		

	}

}
