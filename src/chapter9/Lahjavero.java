package chapter9;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Lahjavero {
	
	public static double laskeVero(double arvo) {
		double vero = 0;
		if (arvo >= 5000 && arvo <= 25000) {
			vero = (100 + ((arvo - 5000) * 0.08));
			}
		if (arvo > 25000 && arvo <= 55000) {
			vero = (1700 + ((arvo - 25000) * 0.1));
		}
		if (arvo > 55000 && arvo <= 200000) {
			vero = (4700 + ((arvo - 55000) * 0.12));
		}
		if (arvo > 200000 && arvo <= 1000000) {
			vero = (22100 + ((arvo - 200000) * 0.15));
		}
		if (arvo > 1000000) {
			vero = (142100 + ((arvo - 1000000) * 0.17));
		}
		return vero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.println("Anna lahjan suuruus: ");
		double lahjanArvo = input.nextDouble();
		double lahjaVero = laskeVero(lahjanArvo);
		System.out.println("Lahjavero on " + desimaalit.format(lahjaVero) + " euroa");

	}

}
