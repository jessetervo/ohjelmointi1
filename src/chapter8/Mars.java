package chapter8;

import java.util.Arrays;
import java.util.Scanner;
public class Mars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int [] lampotilat = new int [10];
		
		int i=0;
		double summa = 0;
		while (i < lampotilat.length) {
		System.out.println("Syötä mittaus " + (i+1) + "/10: ");
		int mittaus = input.nextInt();
		if (mittaus >= -140 && mittaus <= 20) {
		lampotilat[i] = mittaus;
		i++;
		summa = summa + mittaus;
		} else {
			System.out.println("Anna lämpötila väliltä -140 - +20!");
		}
		}
		double keskilampo = summa / lampotilat.length;
		Arrays.sort(lampotilat);
		System.out.println("Mittausten keskiarvo: " + keskilampo);
		System.out.println("Pienin mittaustulos: " + lampotilat[0]);
		System.out.println("Suurin mittaustulos: " + lampotilat[lampotilat.length-1]);
	}



}
