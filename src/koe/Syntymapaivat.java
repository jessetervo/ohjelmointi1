package koe;

import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDate;
public class Syntymapaivat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        LocalDate paivaNyt = LocalDate.now();
        
        String paiva = "1995-03-11";
        System.out.println("Anna henkilön syntymäpäivä (esim. 30.10.1981): ");
        paiva = input.nextLine();
        String paeva = paiva.substring(0, 2);
        String kuukaas = paiva.substring(3, 5);
        String vuos = paiva.substring(6, 10);
        int p = Integer.parseInt(paeva);
        int k = Integer.parseInt(kuukaas);
        int v = Integer.parseInt(vuos);
        
        int vuosia = 2021;

        

		LocalDate laskeTalla = LocalDate.of(vuosia, k, p);
		long paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), laskeTalla.atStartOfDay()).toDays();
		System.out.println(paiviaValissa);
		
		if (paiviaValissa == 0) {
			System.out.println("Tänään on syntymäpäiväsi!");
		}
		if (paiviaValissa < 0) {
			System.out.println("Syntymäpäiväsi meni jo!");
		}
		if (paiviaValissa > 0) {
			System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää.");
		}
	
	}

}
