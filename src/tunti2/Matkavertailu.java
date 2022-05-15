package tunti2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Matkavertailu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.println("Montako matkaa teet kuukaudessa: ");
		int matkat = input.nextInt();
		System.out.println("Anna yksittäisen lipun hinta: ");
		double lipunHinta = input.nextDouble();
		System.out.println("Anna kuukausilipun hinta: ");
		double kuukausiLipunHinta = input.nextDouble();
		double kuukausiHinta = matkat * lipunHinta;
		
		if(kuukausiLipunHinta < kuukausiHinta) {
			System.out.println("Kuukausilippu on " + desimaalit.format(kuukausiHinta - kuukausiLipunHinta) + " euroa halvempi kuin yksittäinen");
		} else {
			System.out.println("Yksittäinen on " + desimaalit.format(kuukausiLipunHinta - kuukausiHinta) + " euroa halvempi kuin kuukausilippu");
			
		}
	
	}
}
