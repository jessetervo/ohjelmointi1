package chapter9;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Kulutus {
	
	static DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	static Scanner input = new Scanner(System.in);
	
	static int kysyKilometrit() {
		System.out.println("Anna ajetut kilometrit: ");
		int kilometrit = input.nextInt();
		return kilometrit;
	}
	
	static double kysyTankkaus() {
		System.out.println("Anna tankattu määrä: ");
		double tankattu = input.nextDouble();
		return tankattu;
	}
	
	static double laskeKulutus(int kilometrit, double tankattu) {
		double kulutus = (tankattu / kilometrit * 100);
		return kulutus;
	}
	
	static void naytaKulutus(double kulutus) {
		System.out.println("Kulutus/100km on " + desimaalit.format(kulutus) + " litraa");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kilometrit = kysyKilometrit();
		double tankattu = kysyTankkaus();
		double kulutus = laskeKulutus(kilometrit, tankattu);
		laskeKulutus(kilometrit, tankattu);
		naytaKulutus(kulutus);
	}

}
