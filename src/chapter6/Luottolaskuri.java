package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		DecimalFormat numerot = new DecimalFormat("0");
		
		double hinta = 0;
		double kuukausierät = 0;
		
		System.out.println("Anna luotollisen ostoksen hinta:");
		hinta = input.nextDouble();
		System.out.println("Anna kuukausierien lukumäärä:");
		kuukausierät = input.nextDouble();
		double monesko = 0;
		double erä = hinta / kuukausierät;
		for (monesko = 0; monesko < kuukausierät; monesko++) {
			System.out.println((numerot.format(monesko + 1)) + ". erä " + desimaalit.format(erä) + " euroa, luottoa jäljellä " + (desimaalit.format(hinta - (monesko + 1) * erä) + " euroa"));
			
		}
		
	}

}
