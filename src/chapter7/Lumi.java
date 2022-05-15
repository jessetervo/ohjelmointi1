package chapter7;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lumia = 0;
		int nimia = 0;
		String nimi;
		do {
		System.out.println("Anna nimi: ");
		nimi = input.nextLine();
		if (nimi.equalsIgnoreCase("lumi") == true) {
			lumia = lumia + 1;
			nimia = nimia + 1;
		} else if (nimi.equalsIgnoreCase("lumi") == false) {
			nimia = nimia + 1;
		}
		} while (nimi.equalsIgnoreCase("loppu") == false);
		System.out.println("Nimiä oli " + (nimia - 1) + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + lumia + " kertaa.");
		
		
	}

}
